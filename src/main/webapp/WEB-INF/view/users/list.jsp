<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Gek系统</title>
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="/statics/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/statics/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="/statics/plugins/icons/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="/statics/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="/statics/dist/css/skins/_all-skins.min.css">
    <!--引入datatables-->
    <link rel="stylesheet" href="/statics/plugins/datatables/jquery.dataTables.min.css">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <%--<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->--%>
</head>
<body class="hold-transition skin-blue sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">
    <jsp:include page="../pages/leftup_and_right.jsp"/>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                Blank page
                <small>it all starts here</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li><a href="#">Examples</a></li>
                <li class="active">Blank page</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">

            <!-- Default box -->
            <div class="box">
                <div class="box-header with-border">
                    <h3 class="box-title">员工信息</h3>

                    <div class="box-tools pull-right">
                        <button type="button" class="btn btn-box-tool" data-widget="collapse" data-toggle="tooltip"
                                title="Collapse">
                            <i class="fa fa-minus"></i></button>
                        <button type="button" class="btn btn-box-tool" data-widget="remove" data-toggle="tooltip"
                                title="Remove">
                            <i class="fa fa-times"></i></button>
                    </div>
                </div>
                <div class="box-body">
                    <table id="users_datatable" class="table">
                        <thead>
                        <tr>
                            <th>编号</th>
                            <th>账号</th>
                            <th>密码</th>
                            <th>是否可用</th>
                            <th>等级</th>
                            <th>权限</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>

                        </tbody>
                    </table>
                </div>
                <!-- /.box-body -->
                <div class="box-footer">
                    内容页尾
                </div>
                <!-- /.box-footer-->
            </div>
            <!-- /.box -->

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <jsp:include page="../pages/rightbar.jsp"/>
</div>
<!-- ./wrapper -->
<!-- your js here -->

<!-- jQuery 2.2.3 -->
<script src="/statics/plugins/jQuery/jquery-2.2.3.min.js"></script>
<!-- Bootstrap 3.3.6 -->
<script src="/statics/bootstrap/js/bootstrap.min.js"></script>
<!-- SlimScroll -->
<script src="/statics/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="/statics/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="/statics/dist/js/app.min.js"></script>

<!-- AdminLTE 右侧栏标签内部内容 -->
<%--<script src="/statics/dist/js/demo.js"></script>--%>
<!-- 引入datatables-->
<script src="/statics/plugins/datatables/jquery.dataTables.min.js"></script>
<script>
    //document.ready(function(){/***/})
    //function(function(){/****/})
    //TODO 2016年12月3日 上面两者有什么区别么?
    $(document).ready(function () {
        /**
         * datatable传入数据
         */
        $("#users_datatable").DataTable({
            searching: true,               //设置增加搜索选项
            serverSide: true,              //数据来自于服务端(而不是自己统计)
            ordering: false,                //禁止排序功能
            ajax: "/users/userlist_data",  //向服务器请求数据
            columns: [                     //使用columns映射json字符串里面的data数组
                {"data": "id"},
                {"data": "username"},
                {"data": "password"},
                {
                    "data": function (row) {
                        if (row.enabled) {
                            return "<span class='label label-success'>可用</span>"
                        }
                        if (row.enabled) {
                            return "<span class='label label-default'>冻结</span>"
                        }
                    }
                },
                {"data": "level"},
                {
                    "data": function (row) {
                        if (row.groupname == "ROLE_USER") {
                            return "<span class='label label-default'>普通员工</span>"
                        }
                        if (row.groupname == "ROLE_ADMIN") {
                            return "<span class='label label-danger'>管理员</span>"
                        }
                    }
                },
                {
                    "data": function (r) {
                        if (r.groupname == "ROLE_ADMIN" && r.enabled) {
                            return "<button href='javascript:;' class='btn btn-success btn-xs  resetpwd' rel='" + r.id + "'>重置密码</button>" +
                                    "&nbsp;&nbsp;" +
                                    "<button href='javascript:;' class='btn btn-primary btn-xs edit' rel='" + r.id + "'>修改本列</button>"
                        }
                    }
                }
            ],
            //定义国际化
            "language": {
                "search": "请输入员工姓名或登录账号:",                      //搜索条件
                "zeroRecords": "没有匹配的数据",                          //搜索结果显示
                "lengthMenu": "显示 _MENU_ 条数据",
                "info": "显示从 _START_ 到 _END_ 条数据 共 _TOTAL_ 条数据",
                "infoFiltered": "(从 _MAX_ 条数据中过滤得来)",
                "loadingRecords": "加载中...",
                "processing": "处理中...",
                "paginate": {
                    "first": "首页",
                    "last": "末页",
                    "next": "下一页",
                    "previous": "上一页"
                }
            }


        });
        //datatables end


    })
</script>


</body>
</html>



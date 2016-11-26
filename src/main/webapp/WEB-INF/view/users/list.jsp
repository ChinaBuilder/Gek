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
                    <table id="users_datatable">
                        <tr>
                            <th>编号</th>
                            <th>账号</th>
                            <th>密码</th>
                            <th>是否可用</th>
                            <th>信息</th>
                            <th>操作</th>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
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
    $(document).ready(function () {
        $("#users_datatable").DataTable();
    })
</script>
</body>
</html>



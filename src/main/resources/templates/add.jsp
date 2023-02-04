<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Technical Test Salt</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.13.2/css/jquery.dataTables.min.css">

</head>
<body>
<div class="container">
    <form method="post">
        <div class="form-group">
            <label>Nama</label>
            <input type="text" id="nama" name="nama" class="form-control"/>
        </div>
        <div class="form-group">
            <label>Alamat</label>
            <textarea class="form-control" id="alamat" name="alamat"></textarea>
        </div>
        <div class="form-group">
            <label>Kota</label>
            <input type="text" id="kota" name="kota" class="form-control"/>
        </div>
        <div class="form-group">
            <label>Provinsi</label>
            <input type="text" id="provinsi" name="provinsi" class="form-control"/>
        </div>
        <div class="form-group">
            <label>Status</label>
            <input type="text" id="status" name="status" class="form-control"/>
        </div>
        <br/>
        <p><button class="btn btn-primary" type="submit"> Submit </button></p>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.13.2/js/jquery.dataTables.min.js"></script>

<script>
    $(document).ready(function () {
        $('#example').DataTable();
    });
</script>
</body>
</html>
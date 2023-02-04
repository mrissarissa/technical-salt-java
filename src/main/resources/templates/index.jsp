<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Technical Test Salt</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.13.2/css/jquery.dataTables.min.css">

</head>
<body>
<div>
    <table class="table table-striped" id="example">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Nama</th>
            <th scope="col">Alamat</th>
            <th scope="col">Provinsi</th>
            <th scope="col">Tgl Registrasi</th>
            <th scope="col">Status</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <tr th:each="k : ${konsumen}">
            <td th:text="${k.id}"></td>
            <td th:text="${k.nama}"></td>
            <td th:text="${k.alamat}"></td>
            <td th:text="${k.provinsi}"></td>
            <td th:text="${k.tgl_registrasi}"></td>
            <td th:text="${k.status}"></td>
            <td><a href="/updatePage?id=${k.id}">Update</a>   <a href="/deletePage?id=${k.id}">Delete</a></td>

        </tr>
        </tbody>
    </table>
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
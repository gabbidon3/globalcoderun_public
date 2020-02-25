<?php
require_once("conn.php");
$sql = "DELETE FROM staff_info WHERE staff_id='" . $_GET["staff_id"] . "'";
mysqli_query($conn,$sql);
header("Location:index.php");
?>

<?php
require_once("conn.php");
if(count($_POST)>0) {
	$sql = "UPDATE staff_info set staff_fname='" . $_POST["firstName"] . "', staff_lname='" . $_POST["lastName"] . "', address='" . $_POST["address"] . "' WHERE staff_id='" . $_POST["staff_id"] . "'";
	mysqli_query($conn,$sql);
	$message = "Staff Record Updated Successfully";
}
$select_query = "SELECT * FROM staff_info WHERE staff_id='" . $_GET["staff_id"] . "'";
$result = mysqli_query($conn,$select_query);
$row = mysqli_fetch_array($result);
?>
<html>
<head>
<title>Edit Staff Information</title>
<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
<form name="frmUser" method="post" action="">
<div style="width:500px;">
<div class="message"><?php if(isset($message)) { echo $message; } ?></div>
<div align="right" style="padding-bottom:5px;"><a href="index.php" class="link"><img alt='List' title='List' src='images/list.png' width='15px' height='15px'/> List User</a></div>
<table border="0" cellpadding="10" cellspacing="0" width="500" align="center" class="tblSaveForm">
<tr class="tableheader">
<td colspan="2">Edit Staff</td>
</tr>
<tr>

<td><label>First Name</label></td>
<td><input type="text" name="firstName" class="txtField" value="<?php echo $row['staff_fname']; ?>"></td>
</tr>
<td><label>Last Name</label></td>
<td><input type="text" name="lastName" class="txtField" value="<?php echo $row['staff_lname']; ?>"></td>
<tr>
<td><label>address</label></td>
<td><input type="text" name="address" class="txtField" value="<?php echo $row['staff_address']; ?>"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" name="submit" value="Submit" class="btnSubmit"></td>
</tr>
</table>
</div>
</form>
</body></html>

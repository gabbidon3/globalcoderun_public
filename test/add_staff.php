<?php
if(count($_POST)>0) {
	require_once("conn.php");
	$sql = "INSERT INTO staff_info (staff_fname, staff_lname,staff_address) VALUES ('" . $_POST["firstName"] . "','" . $_POST["lastName"] . "','" . $_POST["address"] . "')";
	mysqli_query($conn,$sql);
	$current_id = mysqli_insert_id($conn);
	if(!empty($current_id)) {
		$message = "New Staff Added Successfully";
	}
}
?>
<html>
<head>
<title>Add New User</title>
<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
<form name="frmUser" method="post" action="">
<div style="width:500px;">
<div class="message"><?php if(isset($message)) { echo $message; } ?></div>
<div align="right" style="padding-bottom:5px;"><a href="index.php" class="link"><img alt='List' title='List' src='images/list.png' width='15px' height='15px'/> View Staff</a></div>
<table border="0" cellpadding="10" cellspacing="0" width="500" align="center" class="tblSaveForm">
<tr class="tableheader">
<td colspan="2">Add New Staff</td>
</tr>
<tr>
<td><label>First Name</label></td>
<td><input type="text" name="firstName" class="txtField"></td>
</tr>
<tr>
<td><label>Last Name</label></td>
<td><input type="text" name="lastName" class="txtField"></td>
</tr>
<td><label>Address</label></td>
<td><input type="text" name="address" class="txtField"></td>
</tr>

</tr>
<tr>
<td colspan="2"><input type="submit" name="submit" value="Submit" class="btnSubmit"></td>
</tr>
</table>
</div>
</form>
</body></html>

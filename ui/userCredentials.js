function loginValidation() {

  var userCred = document.getElementById("lcs_username").value;
  var passCred = document.getElementById("lcs_password").value;

	if (userCred && passCred)
	{
		$.ajax({
			url: "http:localhost:/login",
			type: 'POST',
			dataType: 'json',
			data: {'user_cred':userCred,'pass_cred':passCred},
			contentType: 'application/json',
			mimeType: 'application/json',
			success: function (data) 
			{
				alert("Success");
			},
			error:function(data,status,er) 
			{
				alert("error: "+data+" status: "+status+" er:"+er);
			}
		});
		
	}
}

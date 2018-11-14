/**
 * 
 */
var key = document.getElementById("username");
key.onkeyup = function(){
	var username = document.getElementById("username").value;
	if(username.length<3){
		document.getElementById("errorusername").innerHTML = "username is too short";
	}else{
		document.getElementById("errorusername").innerHTML ="";
	}
	
}


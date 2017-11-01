function validate(){
	
	
	if(document.getElementById('nombre').value===""){
		alert('El campo de nombre no puede estar vacío');
		return false;
	}
	
	if(document.getElementById('id').value===""){
		alert('El campo de identificación no puede estar vacío');
		return false;
	}
	
	if(document.getElementById('fnac').value===""){
		alert('El campo de fecha de nacimiento no puede estar vacío');
		return false;
	}
	if(document.getElementById('lugar').value===""){
		alert('El campo de lugar no puede estar vacío');
		return false;
	}
	
	if(document.getElementById('estadoc').value===""){
		alert('El campo de estado civil no puede estar vacío');
		return false;
	}
	
	if(document.getElementById('ciudad').value===""){
		alert('El campo de ciudad no puede estar vacío');
		return false;
	}
	
	if(document.getElementById('estu').value===""){
		alert('El campo de estudios no puede estar vacío');
		return false;
	}
	
	if(document.getElementById('direc').value===""){
		alert('El campo de dirección no puede estar vacío');
		return false;
	}
	
	if(document.getElementById('tel').value===""){
		alert('El campo de teléfono no puede estar vacío');
		return false;
	}
	
	if(document.getElementById('correo').value===""){
		alert('El campo de correo no puede estar vacío');
		return false;
	}
		else {
		return true;
	}

	}
	




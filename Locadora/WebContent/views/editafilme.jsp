<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!------ Include the above in your HEAD tag ---------->

<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="https://cdn.ckeditor.com/4.8.0/basic/ckeditor.js"></script>

<!------ Include the above in your HEAD tag ---------->

<!DOCTYPE html>
<head>
<script>
function Redirecionar(){

	
	window.location.href = "/Locadora/filmes/lista";
}
</script>
    
</head>
<body>

<form:form class="form-horizontal" method="post" action="/Locadora/filmes/edita">
 <td><form:hidden  path="id" /></td> 
<fieldset>
<div class="panel panel-primary">
    <div class="panel-heading">Editar Filme</div>
    
    <div class="panel-body">
<div class="form-group">   
         
         
 
<div class="col-md-11 control-label">
        <p class="help-block"><h11>*</h11> Campo Obrigatório </p>
</div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-2 control-label" for="Nome">Nome do Filme<h11>*</h11></label>  
  <div class="col-md-8">
  <form:input path="titulo" placeholder="" class="form-control input-md" required="" type="text"/>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-2 control-label" for="Nome">Gênero<h11>*</h11></label>  
  <div class="col-md-2">
  <form:input path="genero" class="form-control input-md" required="" type="text"/>
  </div>
  
  <label class="col-md-1 control-label" for="Nome">Data<h11>*</h11></label>  
  <div class="col-md-2">
 <form:input path="datalancamento" placeholder="DD/MM/AAAA" class="form-control input-md" required="" type="date" maxlength="10" OnKeyPress="formatar('##/##/####', this)" onBlur="showhide()"/>
</div>


</div>


<!-- Textarea -->
<div class="form-group">
  <label class="col-md-2 control-label">Sinopse <h11>*</h11></label>  
  <div class="col-md-8">
  <form:textarea path="sinopse" class="form-control" id="obs" name="obs"/>
  </div>
  </div>
</div>

<!-- Button (Double) -->
<div class="form-group">
  <label class="col-md-2 control-label" for="Cadastrar"></label>
  <div class="col-md-8">
    <button id="Cadastrar" name="Cadastrar" class="btn btn-success" type="Submit">Editar</button>
    <a href="#" onclick="Redirecionar();" class="btn btn-danger" data-toggle="modal"> <span>Cancelar</span></a>
  </div>
</div>

</div>
</div>


</fieldset>
</form:form>
<script>
    
</script>
</body>
</html>
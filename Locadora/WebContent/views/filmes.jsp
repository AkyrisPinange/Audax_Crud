<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
 <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Filme</title>
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href="../resources/bootstrap/css/login.css">


<script>
$(document).ready(function(){
	// Activate tooltip
	$('[data-toggle="tooltip"]').tooltip();
	
	// Select/Deselect checkboxes
	var checkbox = $('table tbody input[type="checkbox"]');
	$("#selectAll").click(function(){
		if(this.checked){
			checkbox.each(function(){
				this.checked = true;                        
			});
		} else{
			checkbox.each(function(){
				this.checked = false;                        
			});
		} 
	});
	checkbox.click(function(){
		if(!this.checked){
			$("#selectAll").prop("checked", false);
		}
	});
});

function RedirecionarSave(){
	
	window.location.href = "addFilmes";
};
function RedirecionarEdite(){
	
	window.location.href = "editafilme";
};
function RedirecionarDeleta(){
	
	window.location.href = "deletafilme";
};
function RedirecionarDetalhes(){
	
	window.location.href = "detalhesfilme";
}

function RedirecionarAluga(){
	
	window.location.href = "alugafilme";
}
</script>
</head>
<body>
   <div class="container-xl">
	<div class="table-responsive">
		<div class="table-wrapper">
			<div class="table-title">
				<div class="row">
					<div class="col-sm-6">
					<!--Cabeçalho -->
						<h2>*<b>LocaFilmes</b>*</h2>
					</div>
					<!-- Div com butões Deletar e adicionar novo filme -->
					<div class="col-sm-6">
						<a href="#" onclick="RedirecionarDetalhes();" class="btn btn-success" data-toggle="modal"><i class="material-icons visibility">&#xe8f4;</i> <span>Exibir Detalhes</span></a>
						<a href="#" onclick="RedirecionarSave();" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Adicionar Novo Filme</span></a>						
						<a href="#" onclick="RedirecionarAluga();" class="btn btn-success" data-toggle="modal"><i class="material-icons access_time">&#xe192;</i> <span>Alugar</span></a>
					</div>
				</div>
			</div>
			<table class="table table-striped table-hover">
				<thead>
					<tr>
						<!-- Lista de orientação -->
						<th>id</th>
						<th>Nome</th>
						<th>Gênero</th>
						<th></th>
						<th>Ações</th>
					</tr>
				</thead>
				<tbody>
						   <c:forEach var="x" items="${lista}">   
  							 <tr>  
   							 <td>${x.id}</td>  
   						     <td>${x.titulo}</td>
   						     <td>${x.genero}</td>
   						     <td></td>
								<td><a href="<c:url value='editafilme/${x.id}' />">Alterar</a></td>  
   								<td><a href="<c:url value='deletafilme/${x.id}' />">Excluir</a></td>
   								<td><a href="<c:url value='detalhesfilme/${x.id}' />">detalhar</a></td>
							 </tr>  
   						 </c:forEach>  

				</tbody>
			</table>
			<div class="clearfix">
			<!-- Rodapé meramente ilustrativo -->
				<div class="hint-text">Showing <b>5</b> out of <b>25</b> entries</div>
				<ul class="pagination">
					<li class="page-item disabled"><a href="#">Previous</a></li>
					<li class="page-item active"><a href="#" class="page-link">1</a></li>
					<li class="page-item"><a href="#" class="page-link">2</a></li>
					<li class="page-item"><a href="#" class="page-link">3</a></li>
					<li class="page-item"><a href="#" class="page-link">4</a></li>
					<li class="page-item"><a href="#" class="page-link">5</a></li>
					<li class="page-item"><a href="#" class="page-link">Next</a></li>
				</ul>
			</div>
		</div>
	</div>        
</div> 
<div id="deleteEmployeeModal" class="modal fade">
	<div class="modal-dialog">
		<div class="modal-content">
			<form>
				<div class="modal-header">						
					<h4 class="modal-title">Deletar Filme</h4>
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
				</div>
				<div class="modal-body">					
					<p>Tem certeza de que deseja excluir esses registros?</p>
					<p class="text-warning"><small>Esta ação não pode ser desfeita..</small></p>
				</div>
				<div class="modal-footer">
					<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
					<input type="submit" class="btn btn-danger" value="Delete">
				</div>
			</form>
		</div>
	</div>
</div>

</body>
</html>
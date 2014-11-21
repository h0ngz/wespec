<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>    
<%@ include file="/common/common.jsp" %>

    <!-- Search Modal -->
	<div class="modal fade" id="passwordChange" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
	        <h4 class="modal-title" id="myModalLabel">��й�ȣ ����</h4>
	      </div>
	      <form role="form" name="changePw" action="<%=request.getContextPath()%>/skin/module/passwordChange.jsp" method="post">
	      <div class="modal-body">			
			<div class="form-group">
				<label for="password1">������ ��й�ȣ</label>
				<input type="password" class="form-control" id="password" name="password" placeholder="������ ��й�ȣ">
			</div>
			<div class="form-group">
				<label for="password2">������ ��й�ȣ Ȯ��</label>
				<input type="password" class="form-control" id="password2" name="password2" placeholder="������ ��й�ȣ Ȯ��">
			</div>				
			
	      </div>
	      <div class="modal-footer">	        
	        <button type="button" class="btn btn-primary" onClick="check_pw();"><span class="glyphicon glyphicon-cog"></span> ����</button>
	      </div>
	      </form>
	      <script>
	      function check_pw() {
	    	  if(document.changePw.password.value == document.changePw.password2.value) {
	    		  document.changePw.submit();
	    	  }
	    	  else{
	    		  alert('�Է��� �� ��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ��Է��ϼ���');
	    		  return;
	    	  }
	      }
	      </script>
	    </div>
	  </div>
	</div>
	
	<!-- PHOTO REGISTER Modal -->
	<div class="modal fade" id="photoModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		<form action="<%=request.getContextPath()%>/FileUploadServlet" role="form"  method="post" enctype="multipart/form-data">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
	        		<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
	        		<h4 class="modal-title" id="myModalLabel">���� Upload</h4>
	        	</div>
	      		
				<div class="modal-body">
			        <div class="form-group">
			    		<label for="exampleInputFile">���� ��� ����</label><br>
			    		<img src="${profile.profilePhotoURL}" alt="" style="max-height:400px">
			  		</div>  	
					<div class="form-group">
	    				<label for="exampleInputFile">�������� ÷��</label>
	    				<input type="file" id="exampleInputFile" name="photo" accept="image/*">
	  				</div>  
	  				<div class="alert alert-warning alert-dismissible" role="alert">
						  <button type="button" class="close" data-dismiss="alert"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
						   <h4><strong>������ ������ <kbd>������� ����(3:4)</kbd>�� ����ȭ �Ǿ��ֽ��ϴ�.</strong></h4>
						  <h5>���� ������� <strong>300X400</strong> �̸�, �ڵ� ������¡ �Ǿ� ��µǹǷ� ������ ���� ���Ͻ�, ���� ������ ���� ������ �ٽ� ���߾� �ֽð� �õ��� ���ñ� �ٶ��ϴ�.</h5>	
	    			</div>
	  			</div>      		
	      		<div class="modal-footer">	        
	        		<button type="button" class="btn btn-primary" onClick="submit();"><span class="glyphicon glyphicon-camera"></span> UPLOAD</button>
	      		</div>
	    	</div>
	  	</div>
	  	</form>
	</div>
	
	
	  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<%=skinPath %>/js/bootstrap.min.js"></script>
  </body>
</html>
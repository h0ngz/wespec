<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/common/common.jsp" %>
<jsp:include page="/head.jsp" flush="false"/>
<div class="row">
  <div class="col-md-12">
    <div class="row">
      <!--  ������ ���� ���� -->
      <form action="<%=rootPath %>/test" method="post" name="profile">
      <div class="col-md-3">
      
	      <!--  �̹��� ����Ʈ  -->
	      <div id="effect-6" class="effects clearfix">
	            <div class="img">
	                <img src="<%= imagesPath%>/tumb.jpg" alt="">
	                <div class="overlay">
	                    <a href="#" class="expand">+</a>
	                    <a class="close-overlay hidden">x</a>
	                </div>
	            </div>
	      </div><!-- �̹�������Ʈ�� -->
      
     
        	
      </div>
      <!--  ������ ���� -->
      <div class="col-md-9">       
       <div class="panel panel-default">
		  <div class="panel-body">
		    <h2>ȫ�ٿ�</h2>
		    
		    <input type="text" name="engName" value="Hong Paul"/> / 
		    <input type="text" name="chiName" value="��ٿ�"/>
		  </div>
		</div>
		
		<table class="table table-hover">
		  <tr>
		    <td class="active">�г�</td>
		    <td class="">
		    <select>
		    	<option value="1">1</option>
		    	<option value="2">2</option>
		    	<option value="3" selected>3</option>
		    	<option value="4">4</option>
		    </select>
		    		�г�
		    </td>
		 	<td class="active">�й�</td>
		 	<td>0729081</td>
		  </tr>	
		  <tr>
		    <td class="active">����ó</td>
		    <td class=""><input type="text" name="phone" value="010-8985-5334"/></td>
		 	<td class="active">�̸���</td>
		 	<td><input type="text" name="email"  value="h0ngz@naver.com"/></td>
		  </tr>	
		   <tr>
		    <td class="active">SNS</td>
		    <td colspan="3">dddddddddd</td>		 	
		  </tr>		 	
		</table>
		<div class="col-md-12">
			<div class="col-md-3"></div>
			<div class="col-md-6">			
				<button type="button" class="btn btn-primary btn-lg btn-block" onClick="submit()">������ ���</button>
			</div>
			<div class="col-md-3"></div>			
		</div>
		
      </div>
      </form>	
    </div> <!--  ������ ���� �� -->
  	
    <hr> <!--  ��輱 -->
    <!--  �̷� ���� -->
    
	<form action="<%=rootPath %>/test" name="spec" method="post" >
    <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>�ڰ���</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s1">	  	
		 <tr>
		   <th class="col-md-2">�����</th>
		   <th class="col-md-2">�ڰ�����</th>
		   <th class="col-md-2">���</th>
		   <th class="col-md-2">������</th>
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="�ڰ��� �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s1()">�߰�</button></th>
		 </tr>
		 <tr>
		   <td class="col-md-2">2012.08.12</td>
		   <td class="col-md-2">�������μ���</td>
		   <td class="col-md-2">1��</td>
		   <td class="col-md-2">�ѱ�������б�</td>
		   <td class="col-md-2">��ü����</td>
		   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
		</tr>
      </table>		  
	</div>  <!--  section END -->
	
	
	

	
	 <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>���� �ɷ�</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s2">	  	
		 <tr>
		   <th class="col-md-2">���</th>
		   <th class="col-md-2">�����</th>
		   <th class="col-md-2">����(���)</th>
		   <th class="col-md-2">�������</th>
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="���дɷ� �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s2()">�߰�</button></th>
		 </tr>
		 <tr>
		   <td class="col-md-2">����</td>
		   <td class="col-md-2">TOEIC</td>
		   <td class="col-md-2">750��</td>
		   <td class="col-md-2">�̱���������ȸ</td>
		   <td class="col-md-2">��ü����</td>
		   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
		</tr>
      </table>		  
	</div>  <!--  section END -->
	
	
	 <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>�������</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s3">	  	
		 <tr>
		   <th class="col-md-2">������</th>
		   <th class="col-md-4">���󳻿�</th>
		   <th class="col-md-2">������</th>		  
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="������� �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s3()">�߰�</button></th>
		 </tr>
		 <tr>
		   <td class="col-md-2">2012.08.12</td>
		   <td class="col-md-4">������ ����� ���ø����̼� ������ ���</td>
		   <td class="col-md-2">������</td>		
		   <td class="col-md-2">��ü����</td>
		   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
		</tr>
      </table>		  
	</div>  <!--  section END -->
	
	
	 <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>����/����</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s4">	  	
		 <tr>
		   <th class="col-md-2">�Ⱓ</th>
		   <th class="col-md-4">������</th>
		   <th class="col-md-2">���</th>		   
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="����/���� �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s4()">�߰�</button></th>
		 </tr>
		 <tr>
		   <td class="col-md-2">2012.08.12 ~ 2013.02.14</td>
		   <td class="col-md-4">������ ������ �缺����</td>		  
		   <td class="col-md-2">�ѱ�������б�</td>
		   <td class="col-md-2">��ü����</td>
		   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
		</tr>
      </table>		  
	</div>  <!--  section END -->
	
	 <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>��Ʈ������</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s5">	  	
		 <tr>
		   <th class="col-md-2">�Ⱓ</th>
		   <th class="col-md-3">��Ʈ��������</th>
		   <th class="col-md-3">��ũ</th>		   
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="��Ʈ������ �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s5()">�߰�</button></th>
		 </tr>
		 <tr>
		   <td class="col-md-2">2012.08.12 ~ 2013.02.14</td>
		   <td class="col-md-3">������ �̷½ý��� - ������</td>		  
		   <td class="col-md-3"><a href="#">http://wesepc.co.kr/adsfji</a></td>
		   <td class="col-md-2">��ü����</td>
		   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
		</tr>
      </table>		  
	</div>  <!--  section END -->
	
	 <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>����Ʈ���� ���� �ɷ�</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s6">	  	
		 <tr>
		   <th class="col-md-2">���(���)��</th>
		   <th class="col-md-2">����</th>	
		   <th class="col-md-2"></th>	
		   <th class="col-md-2"></th>		  		   
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="���ߴɷ� �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s6()">�߰�</button></th>
		 </tr>
		 <tr>
		   <td class="col-md-2">Java</td>
		   <td class="col-md-2">��</td>	
		    <th class="col-md-2"></th>	
		   <th class="col-md-2"></th>		
		   <td class="col-md-2">��ü����</td>
		   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
		</tr>
      </table>		  
	</div>  <!--  section END -->
	
	 <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>�з� ����</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s7">	  	
		 <tr>
		   <th class="col-md-2">���бⰣ</th>
		   <th class="col-md-2">�б���</th>	
		   <th class="col-md-2">����</th>	
		   <th class="col-md-2">����</th>		  		   
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="�з� �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s7()">�߰�</button></th>
		 </tr>
		 <tr>
		   <td class="col-md-2">2004.03 ~ 2007.02</td>
		   <td class="col-md-2">û��������Ű���б�</td>	
		   <td class="col-md-2">��Ʈ��ũ�����ΰ�</td>	
		   <td class="col-md-2">����</td>		
		   <td class="col-md-2">��ü����</td>
		   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
		</tr>
      </table>		  
	</div>  <!--  section END -->
	 
	 <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>����</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s8">	  	
		 <tr>
		   <th class="col-md-2">�����Ⱓ</th>
		   <th class="col-md-2">����</th>	
		   <th class="col-md-2">���</th>	
		   <th class="col-md-2">����</th>		  		   
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="�з� �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s8()">�߰�</button></th>
		 </tr>
		 <tr>
		   <td class="col-md-2">2008.07 ~ 2010.08</td>
		   <td class="col-md-2">����</td>	
		   <td class="col-md-2">����</td>	
		   <td class="col-md-2">����</td>		
		   <td class="col-md-2">��ü����</td>
		   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
		</tr>
      </table>		  
	</div>  <!--  section END -->
	
	 </form>
  </div>
</div>

<jsp:include page="/tail.jsp" flush="false" />

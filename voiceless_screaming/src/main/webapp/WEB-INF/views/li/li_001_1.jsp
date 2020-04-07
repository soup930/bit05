<%@ include file="../includes/topbar.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<title>후기 게시판</title>
 <script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
function SelectValue(idvalue) {
    var obj_id = document.getElementById('s_id');
    obj_id.value = idvalue;
 }
</script>
</head>
<body background-color:#fff;>
<input type="text" id="s_id">
   <select name="id" onChange="SelectValue(this.value)">
      <option selected>선택
      <option value="g_id1">g_id1
      <option value="g_id2">g_id2
      <option value="g_id3">g_id3
   </select>
   
	<div class="container">
		<h1>XXXXXXX 게시판</h1>
		<div class="table-responsive">
			<table class="table">
				<tr>
					<td>게시물 번호</td>
					<td>장비 분류</td>
					<td>게시글 제목</td>
					<td>장비 종류</td>
					<td>작성자</td>
					<td>작성날자</td>
				</tr>
				<c:forEach var="board" items="${list }">
					<tr>
						<td>${board.li_index }</td>
						<td>${board.li_type }</td>
						<td>${board.li_title }</td>
						<td>${board.li_category }</td>
						<td>${board.m_index }</td>
						<td>${board.li_date }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<ul class="pagination justify-content-end">
								<c:if test="${pageUtil.prev }">
							<li class="page-item"><a class="page-link" href="/li/li_001_1?page=${pageUtil.start-1}">Previous</a></li>
						</c:if>
						<c:forEach begin="${pageUtil.start }" end="${pageUtil.end }"
							var="pNum">
							<li class="page-item ${pNum==pageUtil.dto.page?'active':"" }"><a class="page-link" href="/li/li_001_1?page=${pNum }">${pNum }</a></li>
						</c:forEach>
						<c:if test="${pageUtil.next }">
							<li class="page-item"><a class="page-link" href="/li/li_001_1?page=${pageUtil.end+1 }">Next</a>
							</li>
							</c:if>
							</ul>
	</div>
	<%@ include file="../includes/footer.jsp"%>
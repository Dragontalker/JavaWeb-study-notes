<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="page_nav">
	<c:if test="${requestScope.page.pageNo > 1}">
        <a href="manager/bookServlet?action=page&pageNo=1&pageSize=4">首页</a>
        <a href="manager/bookServlet?action=page&pageNo=${requestScope.page.pageNo-1}&pageSize=4">上一页</a>
    </c:if>
	
	<c:choose>
		<c:when test="${ requestScope.page.pageTotal <= 5 }">
            <c:set var="begin" value="1"/>
            <c:set var="end" value="${requestScope.page.pageTotal}"/>
        </c:when>
		
		<c:when test="${ requestScope.page.pageTotal > 5 }">
			<c:choose>
				<c:when test="${requestScope.page.pageNo <= 3}">
                    <c:set var="begin" value="1"/>
                    <c:set var="end" value="5"/>
                </c:when>
				
				<c:when test="${requestScope.page.pageNo > requestScope.page.pageTotal-3}">
                    <c:set var="begin" value="${requestScope.page.pageTotal-4}"/>
                    <c:set var="end" value="${requestScope.page.pageTotal}"/>
                </c:when>
							
				 <c:otherwise>
                    <c:set var="begin" value="${requestScope.page.pageNo-2}"/>
                    <c:set var="end" value="${requestScope.page.pageNo+2}"/>
                </c:otherwise>
			</c:choose>
		</c:when>
	</c:choose>
	
	<c:forEach begin="${begin}" end="${end}" var="i">
        <c:if test="${i == requestScope.page.pageNo}">
            【${i}】
        </c:if>
        <c:if test="${i != requestScope.page.pageNo}">
            <a href="manager/bookServlet?action=page&pageNo=${i}&pageSize=4">${i}</a>
        </c:if>
    </c:forEach>

	<c:if test="${ requestScope.page.pageNo < requestScope.page.pageTotal }">
		<a href="manager/bookServlet?action=page&pageNo=${ requestScope.page.pageNo + 1 }&pageSize=4">下一页</a>
		<a href="manager/bookServlet?action=page&pageNo=${ requestScope.page.pageTotal }&pageSize=4">末页</a>
	</c:if>
	共${ requestScope.page.pageTotal }页，${ requestScope.page.pageTotalCount }条记录 
	到第<input value="${ requestScope.page.pageNo }" name="pn" id="pn_input"/>页
	<input id="searchPageBtn" type="button" value="确定">
	
	<script type="text/javascript">
		$(function () {
			$("#searchPageBtn").click(function () {
				var pageNo = $("#pn_input").val();								
				location.href = "${ pageScope.basePath }manager/bookServlet?action=page&pageNo=" + pageNo + "&pageSize=4";
			});
		});
	</script>
</div>
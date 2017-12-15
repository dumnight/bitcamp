<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>JSP 예제</title>
<link rel='stylesheet' href='common.css'>
</head>
<body>
<h1>템플릿 데이터</h1>

<p>JSP 파일에 그냥 작성하는 모든 텍스트는 자바의 출력 코드로 만들어진다.</p>
<%-- JSP의 주석 주석은 자바 소스코드로 바뀌지않고 그냥 버려진다 --%>
<!-- HTML주석은 웹브라우저는 무시하지만 JSP 엔진 입장에선 그냥 템플릿 데이터이므로
출력문으로 바뀐다 JSP에 주석을 넣고 싶다면 위의 %-- --%를 이용하자 -->
<h2>JSP 템플릿 데이터</h2>
<pre class="jsp">
<code>
    안녕하세요.
    JSP에 오신걸 환영합니다.
</code>
</pre>

<h2>생성된 자바 코드</h2>
<pre class="java">
<code>
    out.write("안녕하세요.\n");
    out.write("JSP에 오신걸 환영합니다.\n");
</code>
</pre>

</body>
</html>
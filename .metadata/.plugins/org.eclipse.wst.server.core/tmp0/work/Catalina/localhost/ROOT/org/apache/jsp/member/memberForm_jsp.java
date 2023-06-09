/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-07-12 07:04:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memberForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>회원 가입</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/style.css\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.7.0.js\" integrity=\"sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function checkID(){\n");
      out.write("	//alert('test');\n");
      out.write("	//ID 중복 확인\n");
      out.write("	let memberId = $(\"#memberId\").val();\n");
      out.write("	if(memberId == \"\"){\n");
      out.write("		alert(\"아이디를 입력해주세요\");\n");
      out.write("		return false;\n");
      out.write("	}\n");
      out.write("	//ajax 실행\n");
      out.write("	$.ajax({\n");
      out.write("		type: \"post\",\n");
      out.write("		url: \"checkid\",\n");
      out.write("		dataType: \"text\",\n");
      out.write("		data: {id: memberId},  //서블릿쪽으로 id 보냄\n");
      out.write("		success: function(data){ //서블릿에서 응답 받음\n");
      out.write("			console.log(data);\n");
      out.write("			if($.trim(data)=='usable'){ //$.trim()- 앞,뒤 공백을 없애줌\n");
      out.write("				$(\"#btnChk\").attr(\"value\", \"Y\");  //체크 버튼이 눌러짐\n");
      out.write("				$(\"#check\").text(\"사용 가능한 ID입니다.\");\n");
      out.write("				$(\"#check\").css({\"color\": \"blue\", \"padding\": \"5px 0 0 10px\"});\n");
      out.write("			}else{\n");
      out.write("				$(\"#check\").text(\"이미 가입된 ID입니다.\");\n");
      out.write("				$(\"#check\").css({\"color\": \"red\", \"padding\": \"5px 0 0 10px\"});\n");
      out.write("			}\n");
      out.write("		},\n");
      out.write("		error: function(){\n");
      out.write("			alert(\"에러 발생!!\");\n");
      out.write("		}\n");
      out.write("	});\n");
      out.write("}//checkID 끝\n");
      out.write("\n");
      out.write("function checkMember(){\n");
      out.write("	let form = document.member;\n");
      out.write("	let id = form.memberId.value;\n");
      out.write("	let pw1 = form.passwd1.value;\n");
      out.write("	let pw2 = form.passwd2.value;\n");
      out.write("	let name = form.name.value;\n");
      out.write("	let btnChk = form.btnChk.value;  //'Y' or 'N' \n");
      out.write("	\n");
      out.write("	//정규 표현식\n");
      out.write("	let pw_pat1 = /[0-9]+/   //숫자만\n");
      out.write("	let pw_pat2 = /[a-zA-Z]+/   //영어만\n");
      out.write("	let pw_pat3 = /[~!@#$%^&*()_=]+/   //특수문자만\n");
      out.write("	\n");
      out.write("	//이름은 영문자와 한글만 입력되도록 처리\n");
      out.write("	if(id.length < 4 || id.length > 15){\n");
      out.write("		alert(\"아이디는 4~15자까지 입력 가능합니다.\");\n");
      out.write("		form.memberId.select();\n");
      out.write("		return false;\n");
      out.write("	}else if(pw1.length < 8 || !pw_pat1.test(pw1) \n");
      out.write("				|| !pw_pat2.test(pw1) || !pw_pat3.test(pw1)){\n");
      out.write("		alert(\"비밀번호는 영문자, 숫자, 특수문자 포함 8자 이상입니다.\");\n");
      out.write("		form.passwd1.select();\n");
      out.write("		return false;\n");
      out.write("	}else if(pw1 != pw2){\n");
      out.write("		alert(\"비밀번호가 일치하지 않습니다.\");\n");
      out.write("		form.passwd2.select();\n");
      out.write("		return false;\n");
      out.write("	}else if(name==\"\" || pw_pat1.test(name) || pw_pat3.test(name)){\n");
      out.write("		alert(\"이름을 입력해 주세요\");\n");
      out.write("		form.name.focus();\n");
      out.write("		return false;\n");
      out.write("	}else if(btnChk == 'N'){\n");
      out.write("		alert(\"ID 중복을 확인해 주세요.\");\n");
      out.write("		return false;\n");
      out.write("	}else{\n");
      out.write("	    form.submit();\n");
      out.write("	}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
      out.write("\n");
      out.write("	<div id= \"container\">\n");
      out.write("	    <section id=\"register\">\n");
      out.write("		<h2>회원 가입</h2>\n");
      out.write("		<form action=\"/addMember.do\" method=\"post\" name=\"member\">\n");
      out.write("			<fieldset>\n");
      out.write("				<ul>\n");
      out.write("					<li>\n");
      out.write("						<label for=\"memberId\">아이디 </label>\n");
      out.write("						<input type=\"text\" id=\"memberId\" name=\"memberId\"\n");
      out.write("							placeholder=\"아이디는 4~15자까지 입력 가능합니다.\">\n");
      out.write("						<button type=\"button\" id=\"btnChk\" value=\"N\" \n");
      out.write("								class=\"btn_check\" onclick=\"checkID()\" >ID 중복</button>\n");
      out.write("						<p id=\"check\"></p>\n");
      out.write("					</li>\n");
      out.write("					<li>\n");
      out.write("						<label for=\"passwd1\">비밀번호 </label>\n");
      out.write("						<input type=\"password\" id=\"passwd1\" name=\"passwd1\"\n");
      out.write("							placeholder=\"비밀번호는 영문자, 숫자, 특수문자 포함 8자 이상입니다.\">\n");
      out.write("					</li>\n");
      out.write("					<li>\n");
      out.write("						<label for=\"passwd2\">비밀번호 확인</label>\n");
      out.write("						<input type=\"password\" id=\"passwd2\" name=\"passwd2\"\n");
      out.write("							placeholder=\"비밀번호가 일치하지 않습니다.\">\n");
      out.write("					</li>\n");
      out.write("					<li>\n");
      out.write("						<label for=\"name\">이름 </label>\n");
      out.write("						<input type=\"text\" id=\"name\" name=\"name\"\n");
      out.write("							placeholder=\"이름은 영문과 한글로 입력해주세요\">\n");
      out.write("					</li>\n");
      out.write("					<li>\n");
      out.write("						<label for=\"name\">성별 </label>\n");
      out.write("						<label class=\"radio\">\n");
      out.write("							<input type=\"radio\" name=\"gender\" value=\"남\" checked>남\n");
      out.write("						</label>\n");
      out.write("						<label class=\"radio\">\n");
      out.write("							<input type=\"radio\" name=\"gender\" value=\"여\">여\n");
      out.write("						</label>\n");
      out.write("					</li>\n");
      out.write("				</ul>\n");
      out.write("			</fieldset>\n");
      out.write("			<div class=\"button\">\n");
      out.write("				<input type=\"button\" value=\"가입\" onclick=\"checkMember()\">\n");
      out.write("				<input type=\"reset\" value=\"취소\">\n");
      out.write("			</div>\n");
      out.write("			</form>\n");
      out.write("        </section>\n");
      out.write("	</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href='<spring:url value="/resources/css/style.css"/>' />
<title>Transaction End</title>
</head>
<body>
	<div class="divstyle">
		<table style="width:100%">
			<tr>
				<td style="padding-left:5%">
						<img alt="image"
							src='<spring:url value="/resources/images/eNestLog.jpg"/>' />
				</td>
				<td>
					<h1>Transaction End Summary</h1>
				</td>
				<td style="padding-left: 5%">
						<img alt="image"
							src='<spring:url value="/resources/images/unionpaylogo.jpg"/>' />
				</td>
			</tr>
		</table>
	</div>




	<div class="content">
		<div class="tab_content">
			<div class="blue_title">
				<div class="ct_bg clearfix">
					<table align="center" class="table_cnt">
						<thead>
							<tr>
								<td>Netsmid</td>
								<td>:</td>
								<td>
									<div>
										<c:out value="${VALUE.netsMid}" />
									</div>
								</td>
							</tr>
							<tr>
								<td>Nets Reference:</td>
								<td>:</td>
								<td>
									<div>
										<c:out value="${VALUE.netsTxnRef}" />
									</div>
								</td>
							</tr>

							<tr>
								<td>Merchant Reference:</td>
								<td>:</td>
								<td>
									<div>
										<c:out value="${VALUE.merchantTxnRef}" />
									</div>
								</td>
							</tr>

							<tr>
								<td>Merchant Transaction Date Time:</td>
								<td>:</td>
								<td>
									<div>
										<c:out value="${VALUE.merchantTxnDtm}" />
									</div>
								</td>
							</tr>

							<tr>
								<td>Merchant Time zone:</td>
								<td>:</td>
								<td>
									<div>
										<c:out value="${VALUE.merchantTimeZone}" />
									</div>
								</td>
							</tr>

							<tr>
								<td>Payment Type</td>
								<td>:</td>
								<td>
									<div>
										<c:out value="${VALUE.paymentType}" />
									</div>
								</td>
							</tr>

							<tr>
								<td>Transaction Amount</td>
								<td>:</td>
								<td>
									<div>
										<c:out value="${VALUE.txnAmount}" />
									</div>
								</td>
							</tr>
							<tr>
								<td>Transaction Currency</td>
								<td>:</td>
								<td>
									<div>
										<c:out value="${VALUE.currencyCode}" />
									</div>
								</td>
							</tr>
							<tr>
								<td>Nets Transaction Message</td>
								<td>:</td>
								<td>
									<div>
										<c:out value="${VALUE.netdTxnMsg}" />
									</div>
								</td>
							</tr>

							<tr>
								<td>Nets Transaction Status</td>
								<td>:</td>
								<td>
									<div>
										<c:out value="${VALUE.netsTxnStatus}" />
									</div>
								</td>
							</tr>

							<tr>
								<td>Stage Code</td>
								<td>:</td>
								<td>
									<div>
										<c:out value="${VALUE.stageCode}" />
									</div>
								</td>
							</tr>

							<%-- <tr>
					<td>Raw Msg</td>
					<td>:</td>
					
					<td align="justify" style="padding-top: 50%">
					   <p class="wordwrap"><c:out value="${VALUE.rawMsg}" /></p>
					</td>
					
				</tr> --%>
						</thead>
					</table>
					<div style="margin-left: 25%">
						<label style="font-weight: bold;">Raw Message</label>
						<textarea rows="5" cols="7" style="width: 90%" disabled="disabled">${VALUE.rawMsg}</textarea>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
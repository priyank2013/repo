<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/instructor/results" prefix="results" %>
<c:set var="jsIncludes">    
    <script type="text/javascript" src="/js/instructorFeedbackResultsAjaxByQuestion.js"></script>
</c:set>

<results:resultsPage pageTitle="TEAMMATES - Feedback Session Results" bodyTitle="Session Results" jsIncludes="${jsIncludes}" data="${data}">
    <results:byQuestionResults isShowingAll="${data.bundle.complete}" isPanelsCollapsed="${data.shouldCollapsed}" questionPanels="${data.questionPanels}" />    
</results:resultsPage>

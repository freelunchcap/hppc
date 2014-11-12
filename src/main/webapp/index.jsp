<%@ taglib uri="http://jawr.net/tags" prefix="jwr" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8"/>
  <title>登录</title>

  <jwr:style src="/lib.css"/>
  <jwr:style src="/app.css"/>

</head>

<body ng-app="hppc">

<nav class="navbar navbar-inverse" role="navigation" ng-controller="NavigationController">
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">HPPC</a>
    </div>

    <ul class="nav navbar-nav">
      <li ng-repeat="d in departments">
        <a ng-href="#/{{d.path}}">{{d.name}}</a>
      </li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="#">Link</a></li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Dropdown <span class="caret"></span></a>
        <ul class="dropdown-menu" role="menu">
          <li><a href="#">Action</a></li>
          <li><a href="#">Another action</a></li>
          <li><a href="#">Something else here</a></li>
          <li class="divider"></li>
          <li><a href="#">Separated link</a></li>
        </ul>
      </li>
    </ul>
  </div>
</nav>

<div class="container" ng-view></div>

<jwr:script src="/lib.js"/>
<jwr:script src="/app.js"/>
</body>
</html>
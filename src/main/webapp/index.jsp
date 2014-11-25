<%@ taglib uri="http://jawr.net/tags" prefix="jwr" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8"/>
  <title>和平宠物医院 HePing Pet Clinic</title>

  <jwr:style src="/lib.css"/>
  <jwr:style src="/app.css"/>

</head>

<body ng-app="hppc" ng-cloak>

<nav class="navbar navbar-inverse" role="navigation" ng-controller="NavigationController">
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" ui-sref="home">HPPC</a>
    </div>

    <ul class="nav navbar-nav">
      <li ng-repeat="d in departments">
        <a ui-sref="{{d.state}}">{{d.name}}</a>
      </li>
    </ul>
    <ul class="nav navbar-nav navbar-right" ng-show="loginInformation != null">
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-user fa-fw"></i>{{loginInformation.alias}}<span class="caret"></span></a>
        <ul class="dropdown-menu" role="menu">
          <li><a href="#"><i class="fa fa-exclamation-circle fa-fw"></i>用户信息</a></li>
          <li class="divider" ng-if="loginInformation.admin"></li>
          <li ng-if="loginInformation.admin"><a><i class="fa fa-cogs fa-fw"></i>系统设置</a></li>
          <li ng-if="loginInformation.admin"><a><i class="fa fa-newspaper-o fa-fw"></i>公告设置</a></li>
          <li class="divider"></li>
          <li><a href="/security/logout"><i class="fa fa-sign-out fa-fw"></i>登出</a></li>
        </ul>
      </li>
    </ul>
  </div>
</nav>

<div class="container" ui-view></div>

<jwr:script src="/lib.js"/>
<jwr:script src="/app.js"/>
</body>
</html>
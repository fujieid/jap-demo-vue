<p align="center">
	<img src="https://images.gitee.com/uploads/images/2021/0218/094114_99925b8b_784199.png" width="200">
</p>
<p align="center">
	<strong>Just auth into any app</strong>
</p>
<p align="center">
	<a target="_blank" href="https://search.maven.org/search?q=jap">
	  <img src="https://img.shields.io/badge/Maven%20Central-1.0.1%20alpha.1-blue" ></img>
	</a>
	<a target="_blank" href="https://gitee.com/yadong.zhang/JustAuth/blob/master/LICENSE">
	  <img src="https://img.shields.io/badge/license-LGPL%203.0-red" ></img>
	</a>
	<a target="_blank" href="https://apidoc.gitee.com/fujieid/jap" title="API文档">
	  <img src="https://img.shields.io/badge/Api%20Docs-latest-orange" ></img>
	</a>
	<a target="_blank" href="https://justauth.plus" title="开发文档">
	  <img src="https://img.shields.io/badge/Docs-latest-blueviolet.svg" ></img>
	</a>
  <a target="_blank" href="https://codecov.io/gh/fujieid/jap" title="开发codecov档">
	  <img src="https://codecov.io/gh/fujieid/jap/branch/master/graph/badge.svg?token=WmfmgwxtnJ" ></img>
	</a>
  <a target="_blank" href="https://travis-ci.com/fujieid/jap" title="开发codecov档">
	  <img src="https://travis-ci.com/fujieid/jap.svg?branch=master&status=passed" ></img>
	</a>
	<a target="_blank" href="https://gitter.im/fujieid/JAP?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge">
	  <img src="https://badges.gitter.im/fujieid/JAP.svg" ></img>
	</a>
</p>
<p align="center">
  <a target="_blank" href='https://gitee.com/fujieid/jap/stargazers'>
    <img src="https://gitee.com/fujieid/jap/badge/star.svg?theme=white" alt='star'></img>
  </a>
  <a target="_blank" href='https://github.com/fujieid/jap/stargazers'>
    <img src="https://img.shields.io/github/stars/fujieid/jap?style=social" alt='star'></img>
  </a>
</p>
<p align="center">
	<strong>开源地址：</strong> <a target="_blank" href='https://gitee.com/fujieid/jap'>Gitee</a> | <a target="_blank" href='https://github.com/fujieid/jap'>Github</a> | <a target="_blank" href='https://codechina.csdn.net/fujieid/jap'>CodeChina</a>
</p>
<p align="center">
	<strong>社区论坛：</strong> <a target="_blank" href='https://bbs.justauth.plus'>https://bbs.justauth.plus</a>
</p>
<p align="center">
	<strong>开发者中心：</strong> <a target="_blank" href='https://justauth.plus'>https://justauth.plus</a>
</p>

## 可选 Demo

- 普通示例项目：[jap-demo](https://gitee.com/fujieid/jap-demo)
- 前后端分离项目示例：[jap-demo-vue](https://gitee.com/fujieid/jap-demo-vue)


## Demo 使用方式

本 Demo 项目默认开启了 SSO 功能，所以需要提前配置 Hosts

修改本地 hosts，加入以下配置

```
127.0.0.1 sso.jap.com
127.0.0.1 sso1.jap.com
127.0.0.1 sso2.jap.com
127.0.0.1 sso3.jap.com
```

### 启动 ids 服务（可选）

如果开发者已经准备好了 OAuth 2.0 服务端，可以忽略该步。

如果开发者本地没有可以使用的 OAuth 2.0 服务端，那么可以使用 [https://gitee.com/fujieid/jap-ids-demo](https://gitee.com/fujieid/jap-ids-demo) 项目搭建一个 OAuth 2.0 服务器。jap-ids-demo 可以应用于 OAuth 2.0 和 OIDC 协议的登录测试。

### 启动服务端项目

通过 `JapDemoVueApplication` 启动 Java 服务端项目

### 启动 web 端项目

注：前端项目在 `jap-web-demo` 目录下

进入该目录后执行以下命令启动前端项目：

```
npm install
npm run dev
```

### 访问 web 端

[http://sso.jap.com:8080](http://sso.jap.com:8080)

更多使用帮助，请参考：

- [使用 jap-simple](https://justauth.plus/quickstart/jap-simple.html) ：实现账号密码登录
- [使用 jap-social](https://justauth.plus/quickstart/jap-social.html) ：实现第三方账号登录
- [使用 jap-oauth2](https://justauth.plus/quickstart/jap-oauth2.html) ：实现 OAuth 协议登录
- [使用 jap-oidc](https://justauth.plus/quickstart/jap-oidc.html) ：实现 OIDC 协议登录
- [使用 jap-sso](https://justauth.plus/quickstart/jap-sso.html) ： 实现单点登录
- [使用 jap-mfa](https://justauth.plus/quickstart/jap-mfa.html) ： 实现多因素认证

## 项目说明

`JapApiController`为模拟的受保护的资源服务，登录前访问该类下的接口，会跳转到首页并提示“未登录”，登录后访问该类下的接口，可以正常访问

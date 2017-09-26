<#import "./navbar.ftl" as navbar>
<#import "./pagination.ftl" as pagination>
<#macro head>
    <meta name="google-site-verification" content="b_CnJf5BOPuJUVLu7TigxhZtnJhURigLj6pxJ7kv9sA" />
    <#if blog??>
        <title>${blog.name!} | 佳楠的小站</title>
    <#else>
        <title>佳楠的小站</title>
    </#if>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1"/>
    <base href="/">

    <link rel="stylesheet" href="../assets/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="../assets/css/bootstrap-theme.min.css"/>
    <link rel="stylesheet" href="../assets/css/common.css">
    <link href="http://og4nfuylr.bkt.clouddn.com/wang.png" rel="icon">

    <link rel="stylesheet" href="../assets/test/animate.css">
    <link rel="stylesheet" href="../assets/test/app.css">
    <link rel="stylesheet" href="../assets/test/font.css">
    <link rel="stylesheet" href="../assets/test/font-awesome.min.css">
    <link rel="stylesheet" href="../assets/test/simple-line-icons.css">

    <script src="../assets/lib/jquery/jquery.js"></script>
    <script src="../assets/lib/bootstrap/bootstrap.min.js"></script>
    <script src="../assets/lib/bootstrap/bootstrap-confirmation.js"></script>
    <script src="../assets/test/menu-directive.js"></script>

    <#if blog??>
    <meta name="description" content="${blog.description!}">
    <meta property="og:url" content="https://www.oopmind.com/${blog.id!}.html">
    <meta property="og:title" content="${blog.name!} | 佳楠的小站">
    <meta property="og:site_name"content="${blog.name!} | 佳楠的小站"/>
    <#else>
    <meta name="description" content="这是我的个人博客网站，主要是对所学知识的梳理和总结，同时也希望能够帮到其他童鞋。">
    <meta property="og:url" content="https://www.oopmind.com">
    <meta property="og:title" content="佳楠的小站">
    <meta property="og:site_name"content="佳楠的小站"/>
    </#if>

    <#assign channel_meta = "">
    <#list channelList as item>
        <#assign channel_meta += "${item.name},">
    </#list>

    <#assign mark_meta = "">
    <#list markList as item>
        <#assign mark_meta += "${item.name},">
    </#list>
    <meta name="keywords" content="${channel_meta!}">
    <meta name="keywords" content="${mark_meta!}">

    <script>
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "https://hm.baidu.com/hm.js?94f60b01baa9355763a8c83ee9c5f7a7";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>
</#macro>

<#macro article type>
    <#if type="1">
        <!-- 内容区 -->
        <br>
        <article>
            <div class="container-fluid">
                <div class="col-md-11">
                    <#list infoList as item>
                        <div class="row-fluid">
                            <div class="thumbnail">
                                <#--<img src="http://og4nfuylr.bkt.clouddn.com/wang.png">-->
                                <div class="caption">
                                    <h3>
                                        <a href="/${item.id}.html" class="title">${item.name}</a>
                                    </h3>
                                    <div class="caption">
                                        <span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>
                                    ${item.time}前
                                        &nbsp; | &nbsp;
                                        <span class="glyphicon glyphicon-flag" aria-hidden="true"></span>
                                    ${item.blogChannel.name}
                                        &nbsp; | &nbsp;
                                        <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                                        <a href="" class="link" data-toggle="tooltip" data-placement="top" title="由小楠同学发布">小楠同学</a>
                                        &nbsp; | &nbsp;
                                        <span class="glyphicon glyphicon-comment" aria-hidden="true"></span>
                                        7条评论
                                        &nbsp; | &nbsp;
                                        <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                                    ${item.views} views
                                    </div>
                                    <hr class="hr" noshade="noshade">
                                    <div class="caption">
                                        <div>
                                            ${item.content}...
                                        </div>
                                    </div>
                                    <div class="repeat-widget">
                                        <p></p>
                                        <#list item.blogMarkList as mark>
                                            <a href="/mark/${mark.name}" class="label label-success">${mark.name}</a>
                                        </#list>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </#list>

                    <!-- 定义分页信息 -->
                    <@pagination.pagination page totalPage></@pagination.pagination>
                </div>
                <#--<div class="col-md-3">-->
                    <#--<div class="alert alert-info" role="alert">-->
                        <#--主要是对所学知识的梳理和总结，同时也希望能够帮到其他童鞋。现在我给网站添加了云音乐，各位写代码写累了不妨来听听音乐O(∩_∩)O~-->
                    <#--</div>-->

                    <#--<div class="thumbnail">-->
                        <#--<h4 style="margin-left: 10px;">最新文章</h4>-->
                        <#--<hr class="hr">-->
                        <#--<table class="table table-condensed">-->
                            <#--<#list response.newArticleList as item>-->
                                <#--<tr>-->
                                    <#--<td>-->
                                        <#--<a class="link" style="font-size: small" href="/${item.id}.html">${item.name}</a>-->
                                    <#--</td>-->
                                <#--</tr>-->
                            <#--</#list>-->
                        <#--</table>-->
                    <#--</div>-->

                    <#--<div class="thumbnail">-->
                        <#--<h4 style="margin-left: 10px;">标签</h4>-->
                        <#--<hr class="hr" noshade="noshade">-->
                        <#--<#list markList as item>-->
                            <#--<a href="/mark/${item.markName}" class="link" data-toggle="tooltip" data-placement="top" title="${item.count} 个话题">-->
                                <#--${item.markName}-->
                            <#--</a>-->
                        <#--</#list>-->
                    <#--</div>-->

                    <#--<div class="thumbnail">-->
                        <#--<h4 style="margin-left: 10px;">分类</h4>-->
                        <#--<hr class="hr" noshade="noshade">-->
                        <#--<ul class="list-group">-->
                            <#--<#list channelMapList as channel>-->
                                <#--<a href="/channel/${channel.name}" class="link" >-->
                                    <#--<li class="list-group-item">-->
                                        <#--<span class="badge badge-info">${channel.count}</span>-->
                                        <#--${channel.name}-->
                                    <#--</li>-->
                                <#--</a>-->
                            <#--</#list>-->
                        <#--</ul>-->
                    <#--</div>-->

                    <#--<div class="thumbnail">-->
                        <#--<h4 style="margin-left: 10px;">友情链接</h4>-->
                        <#--<hr class="hr">-->

                        <#--<table class="table">-->
                            <#--<#list response.friendshipLinkList as friend>-->
                                <#--<tr>-->
                                    <#--<td>-->
                                        <#--<a class="link" href="${friend.url}" target="view_window">${friend.name}</a>-->
                                    <#--</td>-->
                                <#--</tr>-->
                            <#--</#list>-->
                        <#--</table>-->
                    <#--</div>-->
                <#--</div>-->
            </div>
        </article>
        <br>
        <br>
    <#elseif type="2">
        <div class="container">
            <br>
            <div class="col-md-12 thumbnail" style="padding-left: 50px; padding-right: 30px;">
                <div class="caption page-header" style="text-align: center">
                    <h1 >微信</h1>
                    <hr class="hr" noshade="noshade">

                    <h3>扫一扫下面的二维码图案，加我微信</h3>
                    <p>
                        <a href="http://og4nfuylr.bkt.clouddn.com/weixin.jpg" title="微信二维码" rel="fancy-group" class="fancy-ctn fancybox">
                            <img src="http://og4nfuylr.bkt.clouddn.com/weixin.jpg" width="undefined" height="undefined" title="微信二维码" alt="微信二维码">
                        </a>
                    </p>
                </div>
            </div>
        </div>
    <#else>
        <div class="container">
            <div class="col-md-12 thumbnail" style="padding-left: 50px; padding-right: 30px;">
                <div class="caption page-header" style="text-align: center">
                    <h3>
                        <span>${blog.name}</span>
                    </h3>
                    <div class="caption">
                        <span class="glyphicon glyphicon-calendar" aria-hidden="true"></span>
                    ${blog.dateTime}
                        &nbsp; | &nbsp;
                        <span class="glyphicon glyphicon-flag" aria-hidden="true"></span>
                    ${blog.channelName}
                        &nbsp; | &nbsp;
                        <span class="glyphicon glyphicon-user" aria-hidden="true"></span>
                        <a href="" class="" data-toggle="tooltip" data-placement="top" title="由admin发布">admin</a>
                        &nbsp; | &nbsp;
                        <span class="glyphicon glyphicon-comment" aria-hidden="true"></span>
                        7条评论
                        &nbsp; | &nbsp;
                        <span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span>
                    ${blog.views} views
                    </div>
                    <hr class="hr" noshade="noshade">
                </div>
                <div>${blog.content}</div>
                <div class="bs-docs-section">
                    <div class="bs-callout bs-callout-info">
                        <p>原文地址 : <a href="/${blog.id}.html">https://www.oopmind.com/${blog.id}.html</a></p>
                        <p>本站遵循 : 署名-非商业性使用-相同方式共享 2.5 中国大陆 (CC BY-NC-SA 2.5)</p>
                        <p>版权声明 : 原创文章转载时，请务必以超链接形式标明文章原始出处</p>
                    </div>
                </div>

                <div id="SOHUCS" sid="${blog.gid}"></div>
                <script charset="utf-8" type="text/javascript" src="https://changyan.sohu.com/upload/changyan.js" ></script>
                <script type="text/javascript">
                    window.changyan.api.config({
                        appid: 'cyt8sabko',
                        conf: 'prod_739465ce3207f75ad83ee655b0d03610'
                    });
                </script>
            </div>
        </div>
    </#if>
</#macro>

<#macro footer>
    <!-- footer -->
    <div class="app-footer wrapper b-t bg-light">
        <div class="center-block" style="width:300px;">
            ©2017-2020 <a href="https://www.oopmind.com"><em style="color:#496;">佳楠博客</em></a>
            | 京ICP备17012872号
            |
            <script type="text/javascript">var cnzz_protocol = (("https:" == document.location.protocol) ? " https://" : " http://");document.write(unescape("%3Cspan id='cnzz_stat_icon_1264137158'%3E%3C/span%3E%3Cscript src='" + cnzz_protocol + "s19.cnzz.com/z_stat.php%3Fid%3D1264137158%26show%3Dpic1' type='text/javascript'%3E%3C/script%3E"));</script>
        </div>
    </div>
    <!-- / footer -->
</#macro>

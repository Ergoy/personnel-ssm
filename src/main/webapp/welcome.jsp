<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title></title>
        <meta name="renderer" content="webkit">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
        <link rel="shortcut icon" href="${ctx}/public/logo.ico" type="image/x-icon" />
        <link rel="stylesheet" href="${ctx}/public/css/font.css">
        <link rel="stylesheet" href="${ctx}/public/css/xadmin.css">
        <script type="text/javascript" src="${ctx}/public/js/echarts.js"></script>

    </head>
    <body>
    <div class="x-body layui-anim layui-anim-up">
        <blockquote class="layui-elem-quote">欢迎管理员：
            <span class="x-red">${sessionScope.user_session.username }</span>！当前时间:2021-12-24 20:50:53-------这些数据都是假的，认真你就输了</blockquote>
        <fieldset class="layui-elem-field">
            <legend>数据统计</legend>
            <div class="layui-field-box" style="height: 232px">
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-body">
                            <div class="layui-carousel x-admin-carousel x-admin-backlog" lay-anim="" lay-indicator="inside" lay-arrow="none" style="width: 100%; height: 278px">
                                <div carousel-item="">
                                    <ul class="layui-row layui-col-space10 layui-this">
                                        <div id="main" style="width: 400px;height:280px;display: inline-block">34</div>
                                        <div id="zhexian" style="width: 400px;height:280px;display: inline-block"></div>
                                        <script type="text/javascript">
                                            // 基于准备好的dom，初始化echarts实例
                                            var myChart = echarts.init(document.getElementById('main'));
                                            var newChart=echarts.init(document.getElementById('zhexian'));
                                            // 指定图表的配置项和数据
                                            var option2 = {
                                                title: {
                                                    text: "工龄分布",
                                                    textStyle: {
                                                        color: "black"
                                                    },
                                                    borderWidth: 2,
                                                    borderColor: 'green',
                                                    borderRadius: 5,
                                                    left: 30,
                                                    top: 20
                                                },
                                                xAxis: {
                                                    data: ['1年<', '2年', '3年', '5年', '10年>']
                                                },
                                                yAxis: {},
                                                series: [
                                                    {
                                                        data: [10, 22, 28, 23, 19],
                                                        type: 'line',
                                                        lineStyle: {
                                                            normal: {
                                                                color: 'green',
                                                                width: 4,
                                                                type: 'dashed'
                                                            }
                                                        }
                                                    }
                                                ]
                                            };
                                            var option3 = {
                                                tooltip: {
                                                    trigger: 'item',
                                                    formatter: '{a} <br/>{b}: {c} ({d}%)'
                                                },
                                                legend: {
                                                    data: ['网安部门', '网研部门', '网安三处', '网络基础资源处', '工控部门', '工程中心','其他']
                                                },
                                                series: [
                                                    {
                                                        name: '磁盘使用率',
                                                        type: 'pie',
                                                        selectedMode: 'single',
                                                        radius: [0, '30%'],
                                                        label: {
                                                            position: 'inner',
                                                            fontSize: 14,
                                                        },
                                                        labelLine: {
                                                            show: true,
                                                            smooth: 0.2,
                                                        },
                                                        data: [
                                                            {value: 38, name: '已用空间\n(60.32%)'},
                                                            {value: 25, name: '剩余空间\n(39.68%)'},
                                                        ]
                                                    },
                                                    {
                                                        name: '磁盘使用率',
                                                        type: 'pie',
                                                        radius: ['35%', '60%'],
                                                        labelLine: {
                                                            length: 30,
                                                        },
                                                        label: {
                                                            formatter: '{a|{a}}{abg|}\n{hr|}\n  {b|{b}：}{c}  {per|{d}%}  ',
                                                            backgroundColor: '#F6F8FC',
                                                            borderColor: '#8C8D8E',
                                                            borderWidth: 1,
                                                            borderRadius: 4,

                                                            rich: {
                                                                a: {
                                                                    color: '#6E7079',
                                                                    lineHeight: 22,
                                                                    align: 'center'
                                                                },
                                                                hr: {
                                                                    borderColor: '#8C8D8E',
                                                                    width: '100%',
                                                                    borderWidth: 1,
                                                                    height: 0
                                                                },
                                                                b: {
                                                                    color: '#4C5058',
                                                                    fontSize: 14,
                                                                    fontWeight: 'bold',
                                                                    lineHeight: 33
                                                                },
                                                                per: {
                                                                    color: '#fff',
                                                                    backgroundColor: '#4C5058',
                                                                    padding: [3, 4],
                                                                    borderRadius: 4
                                                                }
                                                            }
                                                        },
                                                        data: [
                                                            {value: 514, name: '部门A'},
                                                            {value: 23, name: '部门B'},
                                                            {value: 0.00, name: '部门C'},
                                                            {value: 34816, name: '部门D'},
                                                            {value: 2457.6, name: '部门E'},
                                                            {value: 937, name: '部门F'},
                                                            {value: 164.4, name: '部门G'}
                                                        ]
                                                    }
                                                ]
                                            };
                                            var data = [{
                                                value: 12,
                                                name: '<初中及以下'
                                            }, {
                                                value: 14,
                                                name: '高中'
                                            }, {
                                                value: 21,
                                                name: '普通专科'
                                            }, {
                                                value: 30,
                                                name: '普通本科'
                                            }, {
                                                value: 8,
                                                name: '>研究生和博士'
                                            }];
                                            option4 = {
                                                backgroundColor: '#fff',
                                                title: {
                                                    text: '学历分布',
                                                    subtext: '2021年',
                                                    x: 'center',
                                                    y: 'center',
                                                    textStyle: {
                                                        fontWeight: 'normal',
                                                        fontSize: 16
                                                    }
                                                },
                                                tooltip: {
                                                    show: true,
                                                    trigger: 'item',
                                                    formatter: "{b}: {c} ({d}%)"
                                                },
                                                legend: {
                                                    orient: 'horizontal',
                                                    bottom: '0%',
                                                    data: ['<初中及以下', '高中', '普通专科', '普通本科', '>研究生和博士']
                                                },
                                                series: [{
                                                    type: 'pie',
                                                    selectedMode: 'single',
                                                    radius: ['25%', '58%'],
                                                    color: ['#86D560', '#AF89D6', '#59ADF3', '#FF999A', '#FFCC67'],

                                                    label: {
                                                        normal: {
                                                            position: 'inner',
                                                            formatter: '{d}%',

                                                            textStyle: {
                                                                color: '#fff',
                                                                fontWeight: 'bold',
                                                                fontSize: 14
                                                            }
                                                        }
                                                    },
                                                    labelLine: {
                                                        normal: {
                                                            show: false
                                                        }
                                                    },
                                                    data: data
                                                }, {
                                                    type: 'pie',
                                                    radius: ['58%', '83%'],
                                                    itemStyle: {
                                                        normal: {
                                                            color: '#F2F2F2'
                                                        },
                                                        emphasis: {
                                                            color: '#ADADAD'
                                                        }
                                                    },
                                                    label: {
                                                        normal: {
                                                            position: 'inner',
                                                            formatter: '{c}人',
                                                            textStyle: {
                                                                color: '#777777',
                                                                fontWeight: 'bold',
                                                                fontSize: 14
                                                            }
                                                        }
                                                    },
                                                    data: data
                                                }]
                                            };
                                            newChart.setOption(option2);
                                            // 使用刚指定的配置项和数据显示图表。
                                            myChart.setOption(option4);
                                        </script>
                                      <%--   <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>文章数</h3>
                                                <p>
                                                    <cite>66</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>会员数</h3>
                                                <p>
                                                    <cite>12</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>回复数</h3>
                                                <p>
                                                    <cite>99</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>商品数</h3>
                                                <p>
                                                    <cite>67</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>文章数</h3>
                                                <p>
                                                    <cite>67</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs2">
                                            <a href="javascript:;" class="x-admin-backlog-body">
                                                <h3>文章数</h3>
                                                <p>
                                                    <cite>6766</cite></p>
                                            </a>
                                        </li> --%>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </fieldset>
        <fieldset class="layui-elem-field">
            <legend>系统通知</legend>
            <div class="layui-field-box">
                <table class="layui-table" lay-skin="line">
                    <tbody>
                        <tr>
                            <td >
                                <a class="x-a" href="/" target="_blank">新版x-admin 2.0上线了</a>
                            </td>
                        </tr>
                        <tr>
                            <td >
                                <a class="x-a" href="/" target="_blank">交流qq群:(519492808)</a>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </fieldset>
        <fieldset class="layui-elem-field">
            <legend>系统信息</legend>
            <div class="layui-field-box">
                <table class="layui-table">
                    <tbody>
                        <tr>
                            <th>xxx版本</th>
                            <td>1.0.180420</td></tr>
                        <tr>
                            <th>服务器地址</th>
                            <td>x.xuebingsi.com</td></tr>
                        <tr>
                            <th>操作系统</th>
                            <td>WINNT</td></tr>
                        <tr>
                            <th>运行环境</th>
                            <td>Apache/2.4.23 (Win32) OpenSSL/1.0.2j mod_fcgid/2.3.9</td></tr>
                        <tr>
                            <th>PHP版本</th>
                            <td>5.6.27</td></tr>
                        <tr>
                            <th>PHP运行方式</th>
                            <td>cgi-fcgi</td></tr>
                        <tr>
                            <th>MYSQL版本</th>
                            <td>5.5.53</td></tr>
                        <tr>
                            <th>ThinkPHP</th>
                            <td>5.0.18</td></tr>
                        <tr>
                            <th>上传附件限制</th>
                            <td>2M</td></tr>
                        <tr>
                            <th>执行时间限制</th>
                            <td>30s</td></tr>
                        <tr>
                            <th>剩余空间</th>
                            <td>86015.2M</td></tr>
                    </tbody>
                </table>
            </div>
        </fieldset>
        <fieldset class="layui-elem-field">
            <legend>开发团队</legend>
            <div class="layui-field-box">
                <table class="layui-table">
                    <tbody>
                        <tr>
                            <th>版权所有</th>
                            <td>xxxxx(xxxx)
                                </td>
                        </tr>
                        <tr>
                            <th>开发者</th>
                            <td></td></tr>
                    </tbody>
                </table>
            </div>
        </fieldset>
        <blockquote class="layui-elem-quote layui-quote-nm">这里是底部。</blockquote>
    </div>
        <script>
        var _hmt = _hmt || [];
        (function() {
          var hm = document.createElement("script");
          hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
          var s = document.getElementsByTagName("script")[0]; 
          s.parentNode.insertBefore(hm, s);
        })();
        </script>
    </body>
</html>
/**
 * Created by Intellij IDEA.
 * @Author LUOLIANG
 * @Date 2016/8/2
 * @Comment js文件，用于页面发送ajax请求
 */

//定义一个avalonjs的控制器
var viewmodel = avalon.define({
    //id必须和页面上定义的ms-controller名字相同，否则无法控制页面
    $id: "viewmodel",
    datalist: {},
    text: "查询数据",
    insertText:"插入数据",
    deleteText:"删除数据",
    request: function () {
        $.ajax({
            type: "post",
            url: "/hello/query/1",    //向springboot请求数据的url
            data: {},
            success: function (data) {
                $('button').removeClass("btn-primary").addClass("btn-success").attr('disabled', true);

                viewmodel.datalist = data;

                viewmodel.text = "数据请求成功，已渲染";
            }
        });
    },
    insert: function () {

    },
    delete: function () {
        $.ajax({
            type: "get",
            url: "/hello/query",    //向springboot请求数据的url
            data: {},
            success: function () {
                $('button').removeClass("btn-primary").addClass("btn-success").attr('disabled', true);

                viewmodel.deleteText = "删除成功";
            }
        });
    }
});
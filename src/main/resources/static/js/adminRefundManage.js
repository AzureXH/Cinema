$(document).ready(function () {

    function getRefundForm(){
        return{
            name:$('#refund-name-input').val(),
            isVip:$('#is-vip').val(),
            falseTime:$('#false-time').val(),
            startTime:[$('#refund-time-start-1').val()],
            endTime:[$('#refund-time-end-1').val()],
            penalty:$('#refund-penalty').val()
        };
    }
    $('#refund-form-btn').click(function () {
        var formData = getRefundForm();
        postRequest(
            '/refund/add',
            formData,
            function(res){
                $('#activityModal').modal('hide');
            },
            function (error) {
                alert(error);
            });
    });

});
function inputPlus(obj){
    html = '<div class="input-group centerIp">'+
        '<label class="input-group-addon">IP：</label>'+
        '<input type="text" class="form-control" id="ipInput">'+
        '<label class="input-group-addon">注释：</label>'+
        '<input type="text" class="form-control" id="descInput">'+
        '<span class="input-group-btn">'+
        '<button class="btn btn-info" type="button" data-toggle="tooltip" title="删除" id="delCenterIpGrp"><span class="glyphicon glyphicon-minus"></span></button>'+
        '</span>'+
        '</div>';
    obj.insertAdjacentHTML('beforebegin',html);
}
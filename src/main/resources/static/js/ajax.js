function dataSend(){
    let reviewDto={
        title: $('#title').val(),
        coment: $('#coment').val(),
        score: $('#score').val(),
        size_evaluation: $('#size_evaluation').val(),
        color_evaluation: $('#color_evaluation').val(),
        fabric_evaluation: $('#fabric_evaluation').val()
    };
    $.ajax({
        url: "reviewDto",
        type: "POST",
        data: reviewDto,
        dataType: 'json',
        success: function (data){

        },
        error: function (data){


            alert("error")
        }
    }).done(function (fragment) {
    });
}
/*
function selectdata(){
    $.ajax({
        url:
    })
    var reviewlist=data;
    $.each(reviewlist,function (i){
        var html=
            '<tr><td>'
            +reviewlist[i].id+'</td><td>'
            +reviewlist[i].password+'</td><td>'
            +reviewlist[i].title+'</td><td>'
            +reviewlist[i].title+'</td><td>'
            +reviewlist[i].coment+'</td><td>'
            +reviewlist[i].size_evaluation+'</td><td>'
            +reviewlist[i].color_evaluation+'</td><td>'
            +reviewlist[i].fabric_evaluation+'</td><td>'

        '</td>'
    })
}*/

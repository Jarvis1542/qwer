$(document).ready(function () {
    $('#joinBtn').click(function () {
        window.location.href='/join';
    });

    $('#cancel').click(function () {
        window.location.href='/';
    });

    $('#loginBtn').click(function () {
        window.location.href='/login';
    });

    $('#writeBtn').click(function () {
        window.location.href='/write';
    });

    $('#updateBtn').click(function () {
        var bno = $('#bno').val();
        window.location.href='/update/'+bno;
    });

    $('#join').click(function () {
        var data = {
            id : $('#id').val(),
            password : $('#password').val(),
            name : $('#name').val(),
            type : $('#type').val()
        };

        $.ajax({
            type : 'post',
            url : '/rest/join',
            data : data
        }).done(function () {
            alert('회원가입 완료');
            window.location.href='/';
        }).fail(function (error) {
            alert(error);
        });
    });

    $('#login').click(function () {
        var data = {
            id : $('#loginId').val(),
            password : $('#loginPassword').val(),
        };

        $.ajax({
            type : 'post',
            url : '/rest/login',
            data : data
        }).done(function () {
            alert('로그인 완료');
            window.location.href='/';
        }).fail(function (error) {
            alert(error);
        });
    });

    $('#write').click(function () {
        var data = {
            title : $('#title').val(),
            writer : $('#writer').val(),
            content : $('#content').val(),
            mbo : $('#mno').val()
        };

        $.ajax({
            type : 'post',
            url : '/rest/write',
            data : data
        }).done(function () {
            alert('글등록 완료');
            window.location.href='/';
        }).fail(function (error) {
            alert(error);
        });
    });

    $('#reco').click(function () {
        var data = {
            bno : $('#bno').val(),
            mtype : $('#mtype').val(),
        };

        $.ajax({
            type : 'put',
            url : '/rest/reco',
            data : data
        }).done(function () {
            alert('추천 완료');
            window.location.href='/';
        }).fail(function (error) {
            alert(error);
        });
    });

    $('#delete').click(function () {
        var data = {
            bno : $('#bno').val()
        };

        $.ajax({
            type : 'delete',
            url : '/rest/delete',
            data : data
        }).done(function () {
            alert('삭제 완료');
            window.location.href='/';
        }).fail(function (error) {
            alert(error);
        });
    });

    $('#update').click(function () {
        var bno = $('#bno').val();

        var data = {
            title : $('#title').val(),
            writer : $('#writer').val(),
            content : $('#content').val(),
            bno : $('#bno').val()
        };

        $.ajax({
            type : 'put',
            url : '/rest/update',
            data : data
        }).done(function () {
            alert('수정 완료');
            window.location.href='/select/' + bno;
        }).fail(function (error) {
            alert(error);
        });
    });
});

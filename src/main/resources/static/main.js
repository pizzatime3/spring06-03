$(function(){
  호출();
})


//작성 버튼을 눌렀을때 실행되는 메소드
function 전송(){
   $.ajax({//ajax 비동기 사용시 jquery cdn 필수!!
    url: 'save',    //java와통신할 url 작성
    data : {"content" : $("#content").val()},//보낼데이터
    success: function(re){//응답데이터
        $("#content").val("");
        호출();
    }
   });
}

let list = [];

//모든 방문록 호출하는 메소드
function 호출(){
    $.ajax({
        url : 'getlist',
        success : function(re){
            list = re;

            let html = '<tr>'+
                          '<th>번호</th><th>내용</th><th>비고</th>'+'<br>'+
                       '</tr>';
            for(let i = 0 ; i<list.length ; i++){
            html +=
                '<tr>'+
                   '<td>'+list[i]["no"]+'</td>'+
                   '<td>'+list[i]["content"]+'</td>'+
                   '<td>'+
                        '<button onclick="수정('+list[i]["no"]+')">수정</button>'+
                        '<button onclick="삭제('+list[i]["no"]+')">삭제</button>'+
                   '</td>'+
                '</tr>';
            }

            $("#viewtable").html(html);
        }
    });
}
//해당게시물 삭제 버튼을 눌렀을때 [인수 : 게시물 번호 ]
function 삭제(no){
    $.ajax({
        url : "delete",
        data : {"no":no},
        success : function(re){
             if(re == "1"){
                            alert("수정성공");
                        }else{
                            alert("수정실패");
                        }
                        호출();

        }

    });
}

//해당 게시물 수정 버튼을 눌렀을 때 [인수 : 게시물번호 ]
function 수정(no){
    alert("현재" + no + "번 선택했습니다.");

    $.ajax({
        url : "update",
        data : {"no":no , "content" : $("#content").val()},
        success : function(re){
            if(re == "1"){
                alert("수정성공");
            }else{
                alert("수정실패");
            }
            location.reload();//새로고침
            호출();

        }
    });

}
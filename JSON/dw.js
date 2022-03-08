// json 포맷
// key : 중복 X , value : 값 (중복 가능, 데이터 타입)
var dwAcademy = {
    students : ['오승택','류근환','강인석','김보겸','이인서',
    '나정수','정지유','김민영','이규성',
    '이승섭','이상협','홍준호','유영준'],
    students_count : 15,
    teacher : '현상원',
    today : '2022-03-08',
    subject : ['SQL','JAVA','HTML']
};

//문제 1. students_count가 15이하면 학생 수 부족, 
// 15초과면 학생 수 정상
var count = dwAcademy.students_count;
if(count <= 15) {
    console.log('학생 수 부족');
}else{
    console.log('학생 수 정상');
}

//문제 2. 학생 중 이 씨 몇명인지?
var cnt = 0;
var searchWord = '이';
for(var i=0; i<dwAcademy.students.length; i++){
    var firstName = dwAcademy.students[i].substring(0,1);
    if(firstName == searchWord){
        ++cnt;
    }
}
console.log('이씨는 총 => '+cnt);
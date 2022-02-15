### vscode
-  live server

### head tag
    meta tag : '어떤 목적을 가지고 만들어진 데이터'
    대량의 정보 가운데 찾고 있는 정보를 효율적으로 찾아내서 이용하기 위해 부여되는 데이터.

    title tag : 여러분들이 만들 웹페이지 제목
### body tag
    실제 웹페이지가 제작되는 태그!

### tags
- h : 대, 중, 소 제목쓸 때 사용하는 태그
- img : 이미지를 불러오는 태그
```html
    <img src="" alt="사진" width="500" height="600">
    <!-- alt 속성은 그림이 렌더링되지 못할 때 나타날 문자열을 지정하기 위한 값 -->
```
- a : 링크 태그
```html
    <a href="https://github.com/hyunsangwon">깃허브 이동</a>
```
- input : 작성할 때 사용하는 태그
```html
    <input type="text" placeholder="아이디를 입력하세요">
    <input type="password" placeholder="비밀번호를 입력하세요" maxlength="3">
    <input type="number">
    <input type="checkbox" id="apple" checked>
    <!-- input id랑 for랑 같게 -->
    <label for="apple">Apple</label> 
    <input type="file" multiple>
    <input type="date">
    <input type="month">
    <input type="week">
    <input type="time">
    <input type="button" value="click">
```
- button : input으로 가능하고 별도 태그 존재 (별도 태그가 존재하는 요소가 더 있음)
```html
    <button>click</button>
```
- select : 무언가를 선택할 때 (== 콤보 박스)
```html
    <select name="pets" id="pet-select">
        <option value="">--Please choose an option--</option>
        <option value="dog">Dog</option>
        <option value="cat">Cat</option>
        <option value="hamster">Hamster</option>
        <option value="parrot">Parrot</option>
        <option value="spider">Spider</option>
        <option value="goldfish">Goldfish</option>
    </select>
```

- p : paragraph, 즉 문단의 약자로, 하나의 문단을 만들 때 사용
```html
    <p>사람이 지닌 고유한 향기는 사람의 말에서 뿜어져 나온다.</p>
```

- span : 특정 단어혹은 문장에 효과를 주고 싶을 때
```html
    <p>오늘은 <span>삼겹살<span>을 먹을까요?</p>
```
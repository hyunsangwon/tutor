### form 태그
- form : 입력 양식 태그. form 태그 안에 작성된 양식을 웹 서버에 전송 함. 

### 테이블 태그
- table
```html
    <!-- tr은 행이고, th은 열 -->
    <!-- tr : table row 가로 줄 -->
    <!-- th : table head 표의 제목 -->
    <table>
        <tr>
            <th>아메리카노</th>
            <th>라떼</th>
            <th>모카</th>
        </tr>
    </table>
    <!-- head, body, foot으로 나누는 경우-->
    <!-- td : table data 열 데이터 -->
    <table>
        <thead>
            <tr>
                <th>출장비 내역</th>
                <th>금액</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>교통비</td>
                <td>45000</td>
            </tr>
            <tr>
                <td>식비</td>
                <td>18000</td>
            </tr>
            <tr>
                <td>숙박비</td>
                <td>40000</td>
            </tr>
        </tbody>
        <tfoot>
            <tr>
                <td>총 합계</td>
                <td>103000</td>
            </tr>
        </tfoot>
	</table>
    <!-- rowspan colsapn -->
    
```

### 기타 태그들
- progress
- meter
- details, summary
- datalist
- video
- br
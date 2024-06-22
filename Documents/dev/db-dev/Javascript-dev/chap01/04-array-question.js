/* 4-1 */

const str = '사과,바나나,당근,김밥,치즈,떡볶이,햄버거,환타,사이다,콜라,고양이,강아지';
console.log(findWord(str, '고양이'));
console.log(findWord(str, '샌드위치'));
console.log(findWord(str));

function findWord(str, word) {
    const arr = str.split(',');

    if(word in arr){
        console.log(` ${word} 는 배열 index ${arr.indexOf(word)} 번째에 있습니다 `);
    } else if(!word in arr) {
        console.log ( `${word} 는 배열에 존재하지 않습니다. `);
    } else {
        console.log(`결과를 확인할 수 없습니다. `);
    }
}

/*
고양이는 배열 index 10번째에 있습니다.
샌드위치는 배열에 존재하지 않습니다.
결과를 확인할 수 없습니다.
*/

/* 4-2 */ 
function filterRange(arr, a, b) {
    for(let i=0; i<arr.length; i++){
        if(arr[i] < a || arr[i] > b){
            arr.slice(i, 1); 
            i--;
        }
    }
    console.log(arr);
}
    const arr = [5, 3, 8, 1, 10, 4];
    filterRange(arr, 1, 5);
    console.log(arr);


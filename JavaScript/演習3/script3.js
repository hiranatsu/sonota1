document.write("■■■問1■■■<br>");
//半径5cmの円、半径7ｃｍの円、半径10cmの円の面積を求める。
//円周率は3.14とする。

function total(circle, π=3.14){
    return(circle*circle*π);
}
document.write("1.半径5cmの円の面積<br>");
document.write(total(2)+"<br>");
document.write("2.半径7cmの円の面積<br>");
document.write(total(7)+"<br>");
document.write("3.半径10cmの円の面積<br>");
document.write(total(10)+"<br>");

document.write("<br>");

document.write("■■■問2■■■<br>");
/*大人料金500円、子供料金200円
グループA：大人2人、子供4人
グループB：大人1人、子供5人
グループC：大人3人、子供7人

関数を使用し、それぞれのグループの合計金額を求める。
なお、それぞれ「○○円です。」と表示する。
*/

function adult_total(number_a,adultprice=500){
    return(number_a * adultprice);
}
function child_total(number_c, childprice=200){
    return(number_c * childprice);
}
document.write("・グループA<br>");
document.write(adult_total(2)+child_total(4)+"円です。"+"<br>");

document.write("・グループB<br>");
document.write(adult_total(1)+child_total(5)+"円です。"+"<br>");

document.write("・グループC<br>");
document.write(adult_total(3)+child_total(7)+"円です。"+"<br>");
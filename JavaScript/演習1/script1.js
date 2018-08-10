document.write("■■■問1■■■<br>");
for(var star = 0; star<5; ++star){
    document.write("★");
}
document.write("<br><br>");



document.write("■■■問2■■■<br>");
for(var star2 = 0; star2<3; ++star2){
    document.write("★");
}
document.write("<br>");
for(var star2 = 0; star2<3; ++star2){
    document.write("★");
}
document.write("<br><br>");



document.write("■■■問3■■■<br>");
for(var star3 = 0; star3<5; ++star3){
    document.write("☆");
}
document.write("<br>");
for(var star3 = 0; star3<5; ++star3){
    document.write("☆");
}
document.write("<br><br>");


document.write("■■■問4■■■<br>");
for(var star4 = 0; star4<20; ++star4){
    if(star4%5 == 0 && star4>0){
            document.write("<br>");
    }
        document.write("★");
}

document.write("<br><br>");


document.write("■■■問5■■■<br>");
for(var star5 = 0; star5<12; ++star5){
    if(star5%3 == 0 && star5>0){
        document.write("<br>");
    }
     document.write("★");  
}    
document.write("<br><br>");


document.write("■■■問6■■■<br>");
for(var i=0; i<3; i++){
    for(var a=0; a<4; a++){
        if(a%2 == 1){
            document.write("★"); 
        }else if(a%2 == 0 && a>0){
            document.write("☆");
        }
        
    }
    document.write("<br>");
}

    document.write("<br>");

document.write("■■■問7■■■<br>");
for(var i=0; i<4; i++){
    for(var a=0; a<6; a++){
        if(a%2 == 1){
            document.write("★"); 
        }else if(a%2 == 0 && a>0){
            document.write("☆");
        }
        
    }
    document.write("<br>");
}

document.write("<br>");

document.write("■■■問8■■■<br>");
for(var star8 = 0; star8 < 5; star8++) {
    for(var a=0; a<star8+1; a++){
        document.write("★");
    }
        document.write("<br>");
}

document.write("<br>");
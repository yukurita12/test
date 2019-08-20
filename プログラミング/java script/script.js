for(var star=1; star<=5; star++){
    document.write("★");
}
document.write("<br>");
document.write("<br>");
document.write("<br>");

for(var star=1; star<=2; star++){
    for(var sstar=1; sstar<=3; sstar++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br>");
document.write("<br>");
document.write("<br>");

for(var starb=1; starb<=2; starb++){
    for(var sstarb=1; sstarb<=5; sstarb++){document.write("☆");}
    document.write("<br>");
}

document.write("<br>");
document.write("<br>");
document.write("<br>");

for(var starc=1; starc<=4; starc++){
    document.write("<br>");
    for(var ssc=1; ssc<=5; ssc++){
        document.write("★");
    }

}

document.write("<br>");
document.write("<br>");
document.write("<br>");

for(var stard=1; stard<=4; stard++){
    for(var ssd=1; ssd<=3; ssd++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br>");
document.write("<br>");
document.write("<br>");

for(var stare=1; stare<=3; stare++){
    for(var sse=1; sse<=3; sse++){
        if(sse%2==0){
            document.write("☆");
        }else{
            document.write("★");
        }
    }document.write("<br>");
}

document.write("<br>");
document.write("<br>");
document.write("<br>");

for(var starf=1; starf<=4; starf++){
    for(var ssf=1; ssf<=5; ssf++){
        if(ssf%2==0){
            document.write("☆");
        }else{
            document.write("★");
        }
    }document.write("<br>");
}

document.write("<br>");document.write("<br>");document.write("<br>");


for(var starz=1; starz<=5; starz++){
    for(var stz=1; stz<=starz; stz++){
        document.write("★");
    }
    document.write("<br>");
}


document.write("<br>");document.write("<br>");document.write("<br>");
document.write("<br>");document.write("<br>");document.write("<br>");

var s=1;
while(s<=25){
    if(s%2==0){
     document.write("☆");
    }else {document.write("★");}
    if(s%5==0){
        document.write("<br>");
    }
    s++
}

document.write("<br>");document.write("<br>");document.write("<br>");


for(var tate=1; tate<=5; tate++){
    for(var yoko=1; yoko<=5; yoko++){
        if(tate==yoko){
            document.write("☆");
        }else{document.write("★");}
    }document.write("<br>");
}


document.write("<br>");document.write("<br>");document.write("<br>");


for(var starz=1; starz<=5; starz++){
    for(var stz=1; stz<=starz; stz++){
        if(starz==stz){
            document.write("☆");}
        else{document.write("★");}
    }
    document.write("<br>");
}

document.write("<br>");document.write("<br>");document.write("<br>");
document.write("<br>");document.write("<br>");document.write("<br>");
document.write("<br>");document.write("<br>");document.write("<br>");



function area(radius){
    return radius*radius*3.14+"㎠";
}
document.write(area(5));
document.write("<br>");
document.write(area(7));
document.write("<br>");
document.write(area(10));

document.write("<br>");document.write("<br>");document.write("<br>");

function fee(adult,child){
    return adult*500+child*200+"円";
}
document.write(fee(2,4));
document.write("<br>");
document.write(fee(1,5));
document.write("<br>");
document.write(fee(3,7));
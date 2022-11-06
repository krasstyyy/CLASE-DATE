public class Date{
private int day;
private int month;
private int year;
public void getDate(int d, int m, int y){
    day=d;
    month=m;
    year=y;
}

public void isSameYear(int y){
    boolean isSameYear=false;
    if(y=year){
        isSameYear=true;
    }
    else{
        isSameYear=false;
    }
}

public void isSameDay(int d){
    boolean isSameDay=false;
    if(d=day){
        isSameDay=true;
    }
    else{
        isSameDay=false;
    }
}

public void isSameMonth(int m){
    boolean isSameMonth=false;
    if(m=month){
        isSameMonth=true;
    }
    else{
        isSameMonth=false;
    }
}

public void isSame(int d, int m, int y){
    boolean isSame=false;
    if(y=year||m=month||d=day){
        isSame=true;
    }
    else{
        isSame=false;
    }
}

public void nombreMes(int m){
    String nombreMes;
    switch(m){
        case 1:nombreMes="Enero";
        break;
        case 2:nombreMes="Febrero";
        break;
        case 3:nombreMes="Marzo";
        break;
        case 4:nombreMes="Abril";
        break;
        case 5:nombreMes="Mayo";
        break;
        case 6:nombreMes="Junio";
        break;
        case 7:nombreMes="Julio";
        break;
        case 8:nombreMes="Agosto";
        break;
        case 9:nombreMes="Septiembre";
        break;
        case 10:nombreMes="Octubre";
        break;
        case 11:nombreMes="Noviembre";
        break;
        case 12:nombreMes="Diciembre";
        break;
    }
    return nombreMes;
}

public void diaMesCorrecto(int d, int m){
    boolean dayRight;
    switch(m){
        case 1: if(0<d<31){
            dayRight=true;
        }
        else{
            dayRight=false;
        }
        break;
        case 2: if(0<d<28){
            dayRight=true;
        }
        else{
            dayRight=false;
        }
        break;
        case 3: if(0<d<31){
            dayRight=true;
        }
        else{
            dayRight=false;
        }
        break;
        case 4: if(0<d<30){
            dayRight=true;
        }
        else{
            dayRight=false;
        }
        break;
        case 5: if(0<d<31){
            dayRight=true;
        }
        else{
            dayRight=false;
        }
        break;
        case 6: if(0<d<30){
            dayRight=true;
        }
        else{
            dayRight=false;
        }
        break;
        case 7: if(0<d<31){
            dayRight=true;
        }
        else{
            dayRight=false;
        }
        break;
        case 8: if(0<d<31){
            dayRight=true;
        }
        else{
            dayRight=false;
        }
        break;
        case 9: if(0<d<30){
            dayRight=true;
        }
        else{
            dayRight=false;
        }
        break;
        case 10: if(0<d<31){
            dayRight=true;
        }
        else{
            dayRight=false;
        }
        break;
        case 11: if(0<d<30){
            dayRight=true;
        }
        else{
            dayRight=false;
        }
        break;
        case 12: if(0<d<31){
            dayRight=true;
        }
        else{
            dayRight=false;
        }
        break;
}
        return dayRight;
}

public void seasonMonth(int m){
    String season;
        switch(m){
        case 1:season="Invierno";
        break;
        case 2:season="Invierno";
        break;
        case 3:season="Primavera";
        break;
        case 4:season="Primavera";
        break;
        case 5:season="Primavera";
        break;
        case 6:season="Verano";
        break;
        case 7:season="Verano";
        break;
        case 8:season="Verano";
        break;
        case 9:season="Otonio";
        break;
        case 10:season="Otonio";
        break;
        case 11:season="Otonio";
        break;
        case 12:season="Invierno";
        break;
        return season;
}
}

public void daysLeft(int d, int m){
    int diasQuedan;
    int diasVan;
switch(m){
    case 1: for(int i=d; i<32; i++){
                diasVan=diasVan+i;
                diasQuedan=365-diasVan;
            }
    break;
    case 2: for(int i=d; i<29; i++){
                diasVan=31+diasVan+i;
                diasQuedan=365-diasVan;
            }
    break;
    case 3: for(int i=d; i<32; i++){
                diasVan=31+28+diasVan+i;
                diasQuedan=365-diasVan;
            }
    break;
    case 4: for(int i=d; i<31; i++){
                diasVan=31+28+31+diasVan+i;
                diasQuedan=365-diasVan;
            }
    break;
    case 5: for(int i=d; i<32; i++){
                diasVan=31+28+31+30+diasVan+i;
                diasQuedan=365-diasVan;
            }
    break;
    case 6: for(int i=d; i<31; i++){
                diasVan=31+28+31+30+31+diasVan+i;
                diasQuedan=365-diasVan;
            }
    break;
    case 7: for(int i=d; i<32; i++){
                diasVan=31+28+31+30+31+30+diasVan+i;
                diasQuedan=365-diasVan;
            }
    break;
    case 8: for(int i=d; i<32; i++){
                diasVan=31+28+31+30+31+30+31+diasVan+i;
                diasQuedan=365-diasVan;
            }
    break;
    case 9: for(int i=d; i<31; i++){
                diasVan=31+28+31+30+31+30+31+31+diasVan+i;
                diasQuedan=365-diasVan;
            }
    break;
    case 10: for(int i=d; i<32; i++){
                diasVan=31+28+31+30+31+30+31+31+30+diasVan+i;
                diasQuedan=365-diasVan;
            }
    break;
    case 11: for(int i=d; i<31; i++){
                diasVan=31+28+31+30+31+30+31+31+30+31+diasVan+i;
                diasQuedan=365-diasVan;
            }
    break;
    case 12: for(int i=d; i<32; i++){
                diasVan=31+28+31+30+31+30+31+31+30+31+30+diasVan+i;
                diasQuedan=365-diasVan;
            }
    break;
}
    System.out.println(fechaString);
}

public void getStringDate(int m, int d, int y){
    String fechaString;
    for(int i=1; i<diaMesCorrecto(); i++){
        d=i;
        switch(i){
            case i: fechaString="Hoy es "+i+"de "+nombreMes()+"de 2022";
            break;
        }
    }
    System.out.println(fechaString);
    return fechaString;
}

public void allDatesLeft(int m, int d){
    String fechasQuedan;
    for(int i=1,int j=1; i<diaMesCorrecto(),j<12; i++,j++){
        d=i;
        m=j;
        switch(i){
            case i: fechasQuedan=i+"de "+j;
            break;
        }
    }
    System.out.println(fechasQuedan);
    return fechasQuedan;
}


public void sameDaysMonths(int m){
    String mismoDiasMes;
    switch(m){
        case 1: mismoDiasMes="Marzo Mayo Julio Agosto Octubre Diciembre";
        break;
        case 2: mismoDiasMes="Ninguno";
        break;
        case 3: mismoDiasMes="Enero Mayo Julio Agosto Octubre Diciembre";
        break;
        case 4: mismoDiasMes="Junio Septiembre Noviembre";
        break;
        case 5: mismoDiasMes="Enero Marzo Julio Agosto Octubre Diciembre";
        break;
        case 6: mismoDiasMes="Abril Septiembre Noviembre";
        break;
        case 7: mismoDiasMes="Enero Marzo Mayo Agosto Octubre Diciembre";
        break;
        case 8: mismoDiasMes="Enero Marzo Mayo Julio Octubre Diciembre";
        break;
        case 9: mismoDiasMes="Abril Junio Noviembre";
        break;
        case 10: mismoDiasMes="Enero Marzo Mayo Julio Agosto Diciembre";
        break;
        case 11: mismoDiasMes="Abril Junio Septiembre";
        break;
        case 12: mismoDiasMes="Enero Marzo Mayo Julio Agosto Octubre";
        break;
    }
}

public void daysGone(int d, int m){
    int diasVan;
switch(m){
    case 1: for(int i=d; i<32; i++){
                diasVan=diasVan+i;
            }
    break;
    case 2: for(int i=d; i<29; i++){
                diasVan=31+diasVan+i;
            }
    break;
    case 3: for(int i=d; i<32; i++){
                diasVan=31+28+diasVan+i;
            }
    break;
    case 4: for(int i=d; i<31; i++){
                diasVan=31+28+31+diasVan+i;
            }
    break;
    case 5: for(int i=d; i<32; i++){
                diasVan=31+28+31+30+diasVan+i;
            }
    break;
    case 6: for(int i=d; i<31; i++){
                diasVan=31+28+31+30+31+diasVan+i;
            }
    break;
    case 7: for(int i=d; i<32; i++){
                diasVan=31+28+31+30+31+30+diasVan+i;
            }
    break;
    case 8: for(int i=d; i<32; i++){
                diasVan=31+28+31+30+31+30+31+diasVan+i;
            }
    break;
    case 9: for(int i=d; i<31; i++){
                diasVan=31+28+31+30+31+30+31+31+diasVan+i;
            }
    break;
    case 10: for(int i=d; i<32; i++){
                diasVan=31+28+31+30+31+30+31+31+30+diasVan+i;
            }
    break;
    case 11: for(int i=d; i<31; i++){
                diasVan=31+28+31+30+31+30+31+31+30+31+diasVan+i;
            }
    break;
    case 12: for(int i=d; i<32; i++){
                diasVan=31+28+31+30+31+30+31+31+30+31+30+diasVan+i;
            }
    break;
}
    System.out.println(diasVan);
    return diasVan;
}

//no se hacer los ultimos de while y do while


}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodeguias;

/**
 *
 * @author Familia Hernandez
 */
public class claseEvaluacionDeMoviles {
    public int BateriaPantalla(int pantalla, int bateria){
    int pun=0;
        if(pantalla<=4 && bateria <=1200){
            pun=3;
        }
        else if(pantalla<=4 &&( bateria>1200 || bateria <=2400) ){
            pun=4;
        }else if(pantalla<=4 && (bateria >2400 || bateria<=3100)){
            pun=5;
        }else if(pantalla<=4 && bateria>3100){
            pun=6;
            //pantalla >4 y <=5
        }else if((pantalla>4|| pantalla<=5 ) && bateria <=1200){
            pun=1;
        }else if((pantalla>4|| pantalla<=5 ) &&( bateria >1200 || bateria<=2400)){
            pun=2;
        }else if((pantalla>4||pantalla<=5) &&(bateria>2400 || bateria<=3100)){
            pun=3;
        }else if((pantalla>4||pantalla<=5) && bateria>3100){
            pun=4;
            //pantalla>5
        }else if(pantalla>5 && bateria<=1200){
            pun=0;
        }else if(pantalla>5 && (bateria>1200 || bateria<=2400)){
            pun=1;
        }else if(pantalla>5 && (bateria>2400 || bateria<=3100)){
            pun=2;
        }else if(pantalla>5 && (bateria>3100)){
            pun=3;
        }
        return pun;   
    } 
    public int puntajeMarca(String marca){
        int puntajemarca=0;
        switch(marca){
            case"Nexus":case "Google": case "Lenovo" : case "Huawei":case "Sony": case "Apple":
                puntajemarca=4;
                break;
    
            case"Samsung": case "Alcatel": case"Lg" :
                puntajemarca=3;
                break;
            case"Seleccione":
                puntajemarca=0;
        }
        return puntajemarca;
    }
    public int rangPrecio(double precio){
        int pumPrecio=0;
        if(precio<100){
            pumPrecio=2;
        }else if(precio>=100 || precio<=350){
            pumPrecio=3;
        }else if(precio>350){
            pumPrecio=4;
        }
        return pumPrecio;
    }
    public int garantia(int tiempo){
        int punTiempo=0;
        if(tiempo<=3){
            punTiempo=1;
        }else if(tiempo>3 || tiempo<=6){
            punTiempo=2;
        }else if(tiempo>6){
            punTiempo=4;
        }
        return punTiempo;
    }
    public int pixelajeCamara(double camPrincipal, double camSecundaria){
        int punCamara=0;
            if(camPrincipal<=5){
                if(camSecundaria>0 || camSecundaria<=2){
                    punCamara=1;
                }else if(camSecundaria>=2 || camSecundaria<3){
                    punCamara=2;
                }
            }else if(camPrincipal>5 || camPrincipal<=8){
                if(camSecundaria>0 || camSecundaria<2){
                    punCamara=1;
                }else if(camSecundaria>=2 || camSecundaria<=3){
                    punCamara=2;
                }else if(camSecundaria>3){
                    punCamara=3;
                }
            }else if(camPrincipal>8){
                if(camSecundaria<=2){
                    punCamara=1;
                }else if(camSecundaria>2 || camSecundaria<=5){
                    punCamara=2;
                }else if(camSecundaria>5){
                    punCamara=3;
                }
            }
        return punCamara;
    }
    public int cpu(int nucleos){
        int punNucleos=0;
            switch(nucleos){
                case 0:
                    punNucleos=0;
                    break;
                case 1:
                    punNucleos=0;
                    break;
                case 2:
                    punNucleos=1;
                    break;
                case 3:
                    punNucleos=2;
                    break;
                case 4:
                    punNucleos=3;
                    break;
            }
        return punNucleos;
    }
    public int ramEquipo(double ram){
        int punRam=0;
            if(ram<=1){
                punRam=0;
            }else if(ram>1 || ram<=2){
                punRam=2;
            }else if(ram>2 || ram<=4){
                punRam=4;
            }else if(ram>4){
                punRam=6;
            }
        return punRam;
    }
    
    
}

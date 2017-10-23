package com.example.davidrr.horoscopo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
   String signo;
    String fecha;
    TextView nombre ;
    ImageView foto;
    TextView descr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Bundle bundle=getIntent().getExtras();
        signo=bundle.getString("signo");
        fecha=bundle.getString("fecha");
        if(fecha==null){
            Toast.makeText(getApplicationContext(), " El signo seleccionado es " + signo, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(getApplicationContext(), "Para el  " + fecha, Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(), " Signo es " + signo, Toast.LENGTH_SHORT).show();
        }

        nombre = (TextView)findViewById(R.id.nombresigno);
        descr = (TextView)findViewById(R.id.descripcion);
        foto = (ImageView)findViewById(R.id.logo);

    switch (signo){
        case "Capricornio":
            nombre.setText("Capricornio");
            descr.setText("es un año sin cambios. Todo seguirá igual. El amor no le quitará el sueño. Estará tan centrado en su trabajo, que no le importará. Si está casado, seguirá igual; y si está soltero también. Luego mes a mes, pueden surgir novedades, pero no están abiertos a nuevas relaciones este año. Muchas entradas y salidas, mucha vida social. Distanta forma de tratar a los demás y cambio de imagen.  ");
            foto.setImageResource(R.drawable.capricornio);
            break;

        case "Acuario":
            nombre.setText("Acuario");
            descr.setText("es un año duro para el amor de pareja. Tendrán lugar 3 eclipses durante el año, como ya hemos mencionado en la introducción (11 Febrero lunar 26 Febrero solar, 21 Agosto solar).\n" +
                    "\n" +
                    "Estos eclipses afectarán directamente al amor y la relación de pareja. Saldrán a relucir todos los trapos sucios de la relación, se echarán cosas en cara y se presentarán ultimátums. Si por el contrario, son una relación muy consolidada y sin problemas, y les va muy bien, lo superarán, aunque aplicando unos cambios relacionales. Pero si su relación es mala, podrían acabar en divorcio o rompiendo. Los que tienen novio/a podrían comprometerse en matrimonio (casarse no). Si están solteros van a estar muy solicitados y podrían salir con varias personas durante el año.  ");
            foto.setImageResource(R.drawable.acuario);
            break;

        case "Piscis":
            nombre.setText("Piscis");
            descr.setText("es un buen año para el amor de pareja. Sigue estando casado o en pareja y es feliz. No es algo que le preocupe, porque funciona bien. Su libido estará por las nubes y su vida sexual será más fuerte que nunca. Es una persona muy voluble en el amor y en su forma de demostrarlo. Su pareja podría acusarle de esto. Nunca se sabe cómo va a estar ni por dónde cogerlo. Quizás pase por periodos en los que tengan pequeños encontronazos con su pareja y se vea obligado a cuestionarse su forma de actuar, a veces tan incongruente y cambiante. ");
            foto.setImageResource(R.drawable.piscis);
            break;

        case "Aries":
            nombre.setText("Aries");
            descr.setText("El amor llenará su vida y se sentirá muy feliz. Podría ser el año de su boda, si es que está soltero todavía o si tiene novia/o. Si todavía está solo, podría enamorarse de una persona extrajera, muy refinada, inteligente y con clase, que pondría su mundo al revés. Le obligaría a replantearselo todo. O también podría enamorarse de algún profesor, alguien que pueda enseñarle cosas nuevas y atraerle. Eso es algo que le enamora. Valorará su formación, su educación, su clase y su posición económica. Amor y dinero van de la mano.");
            foto.setImageResource(R.drawable.aries);
            break;

        case "Tauro":
            nombre.setText("Tauro");
            descr.setText("El amor será bueno, pero especialmente bueno a partir del 11 de Octubre. Se sentirá feliz en su vida amorosa y no sentirá la necesidad de cambiar. Si tiene pareja formal, le irá muy bien y se sentirá satisfecho. Podría ser el año de su boda, a partir de Octubre, si tiene novio/a. Si está soltero, podría conocer a la mujer/hombre de su vida después de esa fecha.");
            foto.setImageResource(R.drawable.tauro);
            break;

        case "Geminis":
            nombre.setText("Geminis");
            descr.setText("Sigue estando en crisis o poniendo a prueba su relación de pareja, en los que habrá discusiones o deberá afrontar situaciones difíciles. Muchos Géminis se divorciaron o separaron en 2016. Los que continúen juntos, será porque se quieren de verdad y están hechos el uno para el otro, pero no será fácil.  ");
            foto.setImageResource(R.drawable.geminis);
            break;

        case "Cancer":
            nombre.setText("Cancer");
            descr.setText("Ha ido limando asperezas, porque vive un ciclo depurativo, emocional y afectivamente, de varios años. Lleva años con parejas que le han hecho ver sus defectos y han terminado en ruptura. Todavía continuará en esta fase de su vida, pero le conviene, porque le permite limpiar los defectos de su comportamiento, las infidelidades, para convertirse en alguien gratificante para compartir su vida con alguien y hacer feliz a su pareja. Su trabajo y los conflictos, que le han rodeado todos estos años, han influido en este proceso. El amor lo suele encontrar en su trabajo y a sus amigos también. ");
            foto.setImageResource(R.drawable.cancer);
            break;

        case "Leo":
            nombre.setText("Leo");
            descr.setText("es un año tranquilo y estable. No habrá cambios en su vida sentimental, pero buscará la estabilidad y la seguridad. Si está en pareja, seguirá con ella. Quizás debería prestarle más atención. No lo dé todo por hecho. El eclipse del 7 de Agosto, le podría hacer pasar por un pequeño periodo de crisis, en el que tendría que replantear la relación y limar asperezas, para que la relación continúe o se rompa. Los viajes al extranjero y las actividades le ayudarán a superar la crisis. En 2017 aprenderá a espiritualizar el acto sexual con el aprendizaje del Yoga Kundalini, Yoga Tantra.  ");
            foto.setImageResource(R.drawable.leo);
            break;

        case "Virgo":
            nombre.setText("Virgo");
            descr.setText("es un año en el que sublimará el amor y sólo aceptará lo mejor. Tiene idealizado el amor y no se dará por satisfecha hasta que alcance la perfección. Esto hará que salgan a la luz secretos de su pareja o situaciones que le podrían escandalizar. Mejor así, porque todo quedará aclarado y vivirá más tranquilo. Es un idealista y siempre tiene miedo, que su relación no esté a la altura de sus expectativas. Podría tratarse de un problema de infidelidad. El 26 de Febrero, fecha del eclipse, saldrán a la luz trapos sucios y fuertes discusiones. Puede pasar de todo: reconciliación o ruptura. El 26 de Abril se le meterá en la cabeza, que su pareja no le quiere de verdad y estará preocupado por eso. A finales de año, su vida amorosa mejora y si ha logrado sobrevivir a todo esto, se sentirán mucho mejor. ");
            foto.setImageResource(R.drawable.virgo);
            break;

        case "Libra":
            nombre.setText("Libra");
            descr.setText("es un año muy activo pero inestable, aunque a estas alturas, ya sabe vivir con ello. Siempre es importante para los Libra, pero este año, se lo pasará esperando que pase algo, que su media naranja irrumpa en su vida y le vuelva loco de deseo y vida. Es un año para relaciones esporádicas y pasionales, no para relaciones serias y profundas. Para los que luchen a fondo por mantener su relación de pareja y no hagan caso de las relaciones esporádicas, bien. Pero los que se dejen llevar por las emociones y ataques por sorpresa de Cupido, están perdidos, porque acabarán en divorcio o ruptura. Está claro que este año surgirán muchas oportunidades de romance durante el año, pero serán encuentros y relaciones efímeras. No se juegue ninguno de estos encuentros por su matrimonio. Consérvelo! ");
            foto.setImageResource(R.drawable.libra);
            break;

        case "Escorpio":
            nombre.setText("Escorpio");
            descr.setText("es un año muy inestable, pero a estas alturas, ya has aprendido a vivir así. Si está casado o en pareja o de novios o soltero, continuarán igual. No se ve divorcio o separación, pero los problemas están ahí, sólo que han aprendido a vivir con ellos. Vivirán una fuerte crisis en Marzo ¡Cuidado!. Mejor así, porque el año próximo y especialmente en el 2019 empieza una nueva etapa de 7 años, en la cual no aceptarán medias tintas yexigirán que todo funcione a la perfección. Entonces, todas las relaciones que estén funcionando mal, acabarán en ruptura. Para los que estén solteros, podrían tener muchas relaciones esporádicas y cambiantes. Podrían enamorarse de alguien del trabajo o de un médico o enfermera. ");
            foto.setImageResource(R.drawable.escorpio);
            break;

        case "Sagitario":
            nombre.setText("Sagitario");
            descr.setText(" Todo seguirá tal como acabe el año 2016. El amor no será muy importante para Vd. este año. Si está casado o soltero, seguirá así, sin necesidad de romper, pero tampoco de más. Lo cierto es que no se va a plantear nada nuevo ni ningún cambio. Estará centrado en otros temas, más importantes para Vd. Si está soltero podría tener varias relaciones esporádicas durante el año. Va a estar muy cambiate a la hora de expresar sus sentimientos o de vivir la relación, con lo cual va a volver locos a sus parejas. Unas veces pretenderá que su pareja sea de una forma y otras todo lo contrario. Debe transmitirle amor a su pareja y empatizar con ella. Si sigue mostrándose frío y distante, se van a distanciar y la podría perder. ");
            foto.setImageResource(R.drawable.sagitario);
            break;
    }
    }
}

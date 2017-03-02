package com.raul.aulamagnaactividad;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {


    TextView title;
    TextView description;
    TextView date;
    TextView category;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);


        title= (TextView) findViewById(R.id.card_text_title);
        description= (TextView) findViewById(R.id.card_text_description);
        date= (TextView) findViewById(R.id.card_text_date);
        category= (TextView) findViewById(R.id.card_text_category);
        image= (ImageView) findViewById(R.id.card_image_view);








        image.setImageResource(R.drawable.fotonoticia);
        title.setText("El Chojín: La universidad es un laboratorio social de experiencias");
        description.setText("Domingo Antonio Edjang Moreno, más conocido como El Chojín, es uno de los compositores de hip hop más conocidos del panorama español, y estuvo la semana pasada en la Universidad de Jaén presentando su primera novela: ‘En 2084’. El Rapero, poeta, escritor, comunicador y pensador animó a los estudiantes a no darse por vencidos, a ser inconformistas y a luchar para cambiar el mundo.\n" +
                "\n" +
                "El Chojín fue un invitado del Consejo de Estudiantes de la UJA, que fue el organismo que solicitó su presencia y organizó su ponencia, con el objetivo de estimular a la comunidad estudiantil jiennense a través de un artista valorado y apreciado por esta. Aula Magna tuvo la oportunidad de entrevistar en persona al rapero madrileño y de conocer las opiniones de una de las voces más influyentes del hip hop nacional.\n" +
                "\n" +
                "“La novela está ambientada en un futuro no muy lejano, de ahí el título ‘En 2084’, y el objetivo es contar el presente a través de los recuerdos del futuro, un futuro en el que a ninguno nos gustaría vivir”, explica El Chojín, quien recalca que la novela es sobre todo “una excusa para retratar la forma en la que veo la situación económica, política y social actual”. En este sentido, el autor subraya que la situación actual de los jóvenes tiene mucho que ver con lo que ha escrito en la novela.\n" +
                "\n" +
                "El Chojín reflexiona sobre el futuro de la Universidad\n" +
                "\n" +
                "“El conocimiento es el arma más poderosa que existe, y siempre habrá una elite social que quiera controlar su acceso, y esto no es algo que ocurra sin querer”, relata el compositor, quien añade que “afortunadamente estamos en un punto en el que nadie tiene el control absoluto de nada, y ejerciendo la presión social adecuada en el lugar adecuado se puede revertir esta situación”. De cara al año 2084, El Chojín profetiza una Universidad utilizada como instrumento de poder, en la que los estudiantes realizan únicamente aquellas carreras prefijadas para ejercer determinados puestos dentro del orden social, según explicó a este periódico.\n" +
                "\n" +
                "El Chojín recuerda su etapa universitaria como un periodo enormemente enriquecedor. “La Universidad es un laboratorio social de experiencias, un laboratorio de vida”, recalca. En este sentido, si bien el artista ofreció un discurso ‘poco optimista’ de cara al futuro social, animó al alumnado a transformar esta realidad y a sentirse capaz de hacerlo, lo que en definitiva fue paradójicamente optimista. Dejando en los estudiantes la sensación de que con trabajo y esfuerzo pueden conseguir todo lo que se propongan.");
        date.setText("01-03-2017");
        category.setText("Andalucía");
    }
}

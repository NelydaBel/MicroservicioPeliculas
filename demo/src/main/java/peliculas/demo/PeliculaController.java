package peliculas.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;


@RestController
public class PeliculaController {
    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController(){
        peliculas.add(new Pelicula(
            1, "Mad Max: furia en el camino", 2015, "George Miller", "Ciencia ficción",
            "Aunque está decidido a vagar solo por el páramo post-apocalíptico, Mad Max se une a Furiosa, una comandante fugitiva, y su banda, quienes están tratando de escapar de un señor de la guerra."));
        peliculas.add(new Pelicula(
            2, "Ad Astra: Hacia las estrellas", 2019, "James Gray","Suspenso-Ciencia ficción",
            "Ingeniero que perdió a su padre en una misión sin retorno a Neptuno. Veinte años después, emprende el mismo viaje a través del sistema solar para tratar de encontrarlo."));
        peliculas.add(new Pelicula(
            3, "Unidos", 2020, "Dan Scanlon", "Infantil",
            "Dos hermanos elfos adolescentes hacen un viaje en busca de un poco de magia para pasar un último día con su padre fallecido."));
        peliculas.add(new Pelicula(
            4, "El origen", 2010, "Christopher Nolan", "Ciencia ficción",
            "Un ladrón con una extraña habilidad para entrar a los sueños de la gente y robarle los secretos de sus subconscientes. Su habilidad lo ha convertido en un atractivo en el mundo del espionaje corporativo, pero ha tenido un gran costo en la gente que ama."));
        peliculas.add(new Pelicula(
            5, "Gladiador", 2000, "Ridley Scott", "Acción",
            "Máximo, general romano, desea volver a casa, pero el emperador Marco Aurelio quiere que herede el imperio. Esto hace que Cómodo ordene matar a su familia. Máximo escapa de la muerte y regresa a Roma como gladiador para vengar la muerte de su familia."));
        peliculas.add(new Pelicula(
            6, "El niño con el pijama de rayas", 2008, "Mark Herman", "Bélico-Suspenso",
            "Durante la Segunda Guerra Mundial, el pequeño hijo de un comandante de un campo de concentración desarrolla una amistad prohibida con un niño judío de 8 años."));
    }
    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    @GetMapping("/peliculas/{id}")
    public Pelicula getPeliculaById(@PathVariable int id) {
        for (Pelicula pelicula : peliculas){
            if(pelicula.getId() == id){
                return pelicula;
            }
        }
        return null;
    }
    
}

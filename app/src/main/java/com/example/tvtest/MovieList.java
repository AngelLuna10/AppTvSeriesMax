package com.example.tvtest;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Category All",
            "Category Action",
            "Category Drama",
            "Category Horror",
            "Category Animated",
            "Category Comedy",
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if (list == null) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "Van Helsing",
                "Dreamland",
                "One Missed Call",
                "Spider-Man A New Universe",
                "The Animal"
        };

        String description = "Fusce id nisi turpis. Praesent viverra bibendum semper. "
                + "Donec tristique, orci sed semper lacinia, quam erat rhoncus massa, non congue tellus est "
                + "quis tellus. Sed mollis orci venenatis quam scelerisque accumsan. Curabitur a massa sit "
                + "amet mi accumsan mollis sed et magna. Vivamus sed aliquam risus. Nulla eget dolor in elit "
                + "facilisis mattis. Ut aliquet luctus lacus. Phasellus nec commodo erat. Praesent tempus id "
                + "lectus ac scelerisque. Maecenas pretium cursus lectus id volutpat.";
        String studio[] = {
                "Studio Zero", "Studio One", "Studio Two", "Studio Three", "Studio Four"
        };
        String videoUrl[] = {
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Zeitgeist/Zeitgeist%202010_%20Year%20in%20Review.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/Demo%20Slam/Google%20Demo%20Slam_%2020ft%20Search.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Gmail%20Blue.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Fiber%20to%20the%20Pole.mp4",
                "https://commondatastorage.googleapis.com/android-tv/Sample%20videos/April%20Fool's%202013/Introducing%20Google%20Nose.mp4"
        };
        String bgImageUrl[] = {
                "https://es.web.img3.acsta.net/newsv7/15/11/02/19/53/374953.jpg",
                "https://lechatmagazine.com/wp-content/uploads/2021/04/critica-dreamland-margot-robbie-amazon-prime-2021-PORTADA.jpg",
                "https://richardcrouse.ca//wp-content/uploads/2013/09/358_1.jpg",
                "https://i.blogs.es/00243f/spider-verse-2/840_560.jpeg",
                "https://m.media-amazon.com/images/M/MV5BMjA1NzUxOTg5Ml5BMl5BanBnXkFtZTcwMjQ5NzI5NA@@._V1_.jpg",
        };
        String cardImageUrl[] = {
                "https://www.tonica.la/__export/1606881842446/sites/debate/img/2020/12/01/james-wan-producira-nueva-pelicula-sobre-van-helsing_crop1606881761120.jpg_759710130.jpg",
                "https://losinterrogantes.com/wp-content/uploads/2021/10/dreamland-pelicula-4.jpg",
                "https://www.cinepremiere.com.mx/wp-content/uploads/2008/07/una-llamada-perdida-critica.jpg",
                "https://www.ecartelera.com/carteles/9900/9975/003_m.jpg",
                "https://images-na.ssl-images-amazon.com/images/I/91ZtFYTtFUL._RI_.jpg"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description,
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }

        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}
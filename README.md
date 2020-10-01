# Flixster
Flixster is an app that allows users to browse movies from the [The Movie Database API](http://docs.themoviedb.apiary.io/#).

## Flix Part 2

### User Stories

#### REQUIRED (10pts)

- [X] (8pts) Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity.
- [X] (2pts) Allow video posts to be played in full-screen using the YouTubePlayerView.

#### BONUS

- [ ] Trailers for popular movies are played automatically when the movie is selected .
  - [ ] When clicking on a popular movie (i.e. a movie voted for more than 5 stars) the video should be played immediately.
  - [ ] Less popular videos rely on the detailed page should show an image preview that can initiate playing a YouTube video.
- [ ] Add a play icon overlay to popular movies to indicate that the movie can be played .
- [ ] Apply the popular ButterKnife annotation library to reduce view boilerplate. 
- [X] Add a rounded corners for the images using the Glide transformations. 
- [X]  Improved the user interface by experimenting with styling and coloring.

### App Walkthough GIF



<img src="https://github.com/JayavardhaniKathika/Flixster/blob/master/WalkthroughPart2.gif" width=250><br>

### Notes

Describe any challenges encountered while building the app.
1. Using Youtube Player view was confusing.

## Open-source libraries used
- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

---

## Flixster Part 1

### User Stories

#### REQUIRED
- [X]  User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.

#### BONUS
- [X]  Views should be responsive for both landscape/portrait mode.
   - [X]  In portrait mode, the poster image, title, and movie overview is shown.
   - [X]  In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.

- [ ]  Display a nice default [placeholder graphic](https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#advanced-usage) for each image during loading
- [ ]  Improved the user interface by experimenting with styling and coloring.
- [ ]  For popular movies (i.e. a movie voted for more than 5 stars), the full backdrop image is displayed. Otherwise, a poster image, the movie title, and overview is listed. Use Heterogenous RecyclerViews and use different ViewHolder layout files for popular movies and less popular ones.

### App Walkthough GIF


<img src=https://github.com/JayavardhaniKathika/Flixster/blob/master/WalkThrough_Protrait.gif width=250><br>



<img src=https://github.com/JayavardhaniKathika/Flixster/blob/master/WalkThrough_Landscape.gif width=250><br>


### Notes
This app helped me to clearly understand the concepts of Recycler View, Adapter, View Holder and Layout Manager

### Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Androids

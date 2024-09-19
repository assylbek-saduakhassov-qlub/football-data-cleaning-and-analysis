# Football Data Cleaning and Analysis

## Overview
This project focuses on cleaning and analyzing football match data using Java and the MapReduce framework. The data includes match statistics, scores, and betting odds. The project involves preprocessing the data, extracting unique records, and performing transformations to generate insights.

## Data Description
- **`input.txt`**: Contains raw football match data, including statistics and betting odds. The columns include:
  - `Div`: Division of the match.
  - `Date`: Match date.
  - `HomeTeam`: Home team name.
  - `AwayTeam`: Away team name.
  - `FTHG` and `FTAG`: Full-time home and away goals.
  - `FTR`: Full-time result.
  - `Referee`: Match referee.
  - Various columns for betting odds and match statistics.

- **`input_clean.txt`**: Cleaned version of the `input.txt` file after applying data preprocessing techniques.

## Prerequisites
- **Java Development Kit (JDK)**: Version 8 or higher.
- **Hadoop**: For running MapReduce jobs.

## Results
- The project processes the raw football data to:
  - Remove duplicates and inconsistencies.
  - Extract unique records of matches with relevant statistics.
  - Output cleaned and structured data for further analysis.
- The cleaned data can be used for various analytical purposes, such as predicting match outcomes or analyzing team performance.

## Contributing
Feel free to fork this repository and make changes. Pull requests are welcome!

## Contact
If you have any questions or suggestions, feel free to reach out via [GitHub Issues](https://github.com/assylbek-saduakhassov-qlub/head_football_game/issues).


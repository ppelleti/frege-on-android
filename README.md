<!--
README.md - documentation about using the Frege language on Android

Written in 2016 by Patrick Pelletier <code@funwithsoftware.org>

To the extent possible under law, the author(s) have dedicated all
copyright and related and neighboring rights to this software to the
public domain worldwide. This software is distributed without any
warranty.

You should have received a copy of the CC0 Public Domain Dedication
along with this software. If not, see
<http://creativecommons.org/publicdomain/zero/1.0/>.
-->
This repository is an example of how to call code written in
[Frege][1] from an Android program.  It's assumed that you will write
your user interface in Java, and just write application logic in
Frege.  Calling Android APIs from Frege is trickier and is not
discussed here.

## Screenshot

![FregeActivity][3]

## Using in your own project

You can get started using this repo as the basis for your own project
by running the `change-package-name.pl` script in this directory.
Give it the package name you want to use, and the activity name you
want to use, and it will rename the code.  For example:

    ./change-package-name.pl com.example.whatever WhateverActivity

## License

The code in this repo that I (Patrick Pelletier) have written is in
the public domain / [cc0][0].  However, some of the files come from
the scaffolding generated by `android project create`, and part of the
`build.gradle` file comes from [a post on the Frege mailing list][2].

[0]: https://creativecommons.org/publicdomain/zero/1.0/legalcode.txt
[1]: http://frege-lang.org/
[2]: https://groups.google.com/forum/#!msg/frege-programming-language/iIJeAwlf8UM/sqOcu7f6AwAJ
[3]: screenshot.png
package com.geektech.myapplication.repository

import com.geektech.myapplication.data.TextModel

class LanguagesRepository {
    private val languagesRepository: ArrayList<TextModel> = ArrayList<TextModel>()
    fun getListOfCatHTP(): ArrayList<TextModel>{

        languagesRepository.add(
            TextModel(
                "https://d3njjcbhbojbot.cloudfront.net/api/utilities/v1/imageproxy/https:" +
                        "//coursera-course-photos.s3.amazonaws.com/0a/8cd7f1b14344618b75142593bc7af8/JavaCupLogo800x800" +
                        ".png?auto=format%2Ccompress&dpr=1",
                "Java"
            )
        )
        languagesRepository.add(
                TextModel(
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Unofficial_JavaScript_logo_2" +
                            ".svg/1200px-Unofficial_JavaScript_logo_2.svg.png",
                    "Java Script"
                )
                )
        languagesRepository.add(
            TextModel(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/0/0a/Python.svg/1200px-Python.svg.png",
                "Python"
            )
        )
        languagesRepository.add(
            TextModel(
                "https://cms-assets.tutsplus.com/uploads/users/1499/posts/29590/preview_image/kotlin.jpg",
                "Kotlin"
            )
        )
        languagesRepository.add(
            TextModel(
                "https://upload.wikimedia.org/wikipedia/commons/4/4f/Csharp_Logo.png",
                "C#"
            )
        )
        languagesRepository.add(
            TextModel(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/C_Programming_Language" +
                        ".svg/695px-C_Programming_Language.svg.png",
                "C"
            )
        )
        languagesRepository.add(
            TextModel(
                "https://upload.wikimedia.org/wikipedia/commons/thumb/1/18/ISO_C%2B%2B_Logo" +
                        ".svg/1200px-ISO_C%2B%2B_Logo.svg.png",
                "C++"
            )
        )
        languagesRepository.add(
            TextModel(
                "https://e7.pngegg.com/pngimages/184/548/png-clipart-swift-apple-logo-objective-c-apple-orange-logo.png",
                "Swift"
            )
        )
        languagesRepository.add(
            TextModel(
                "https://i0.wp.com/www.memorylack.com/wp-content/uploads/2010/08/objective-c.png?fit=720%2C580&ssl=1",
                "Objective c"
            )
        )
        languagesRepository.add(
            TextModel(
                "https://cdn-icons-png.flaticon.com/512/919/919834.png",
                "Scala"
            )
        )
        languagesRepository.add(
            TextModel(
                "https://filearchive.cnews.ru/img/book/2022/05/" +
                        "18/png-transparent-go-tutorial-computer-software-protocol-programmer-miscellaneous-logo-snout.png",
                "Golang"
            )
        )
        languagesRepository.add(
            TextModel(
                "https://almatysite.kz/wp-content/uploads/ruby.png",
                "Ruby"
            )
        )
        return languagesRepository
    }
}



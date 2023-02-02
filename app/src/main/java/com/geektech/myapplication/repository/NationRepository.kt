package com.geektech.myapplication.repository

import com.geektech.myapplication.data.TextModel

class NationRepository {

    private val nationRepository: ArrayList<TextModel> = ArrayList<TextModel>()
    fun getListOfCatHTP(): ArrayList<TextModel> {

        nationRepository.add(
            TextModel(
                "https://vlast.kz/media/pages/el/kirgizia_1000x768.jpg",
                "kyrgyzstan"
            )
        )
        nationRepository.add(
            TextModel(
                "https://www.advantour.com/img/kazakhstan/symbols/kazakhstan-flag.jpg",
                "kazakhstan"
            )
        )
        nationRepository.add(
            TextModel(
                "https://www.advantour.com/russia/images/symbolics/russia-flag.jpg",
                "russia"
            )
        )
        nationRepository.add(
            TextModel(
                "https://cdn11.bigcommerce.com/s-2lbnjvmw4d/images/stencil/" +
                        "1280x1280/products/4410/5333/francesleeve__90485.1619695878.jpg?c=2",
                "france"
            )
        )
        nationRepository.add(
            TextModel(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQOJLy7_GdtzPq9mIvML4vtWKnwyvRJcB9R0Q&usqp=CAU",
                "american"
            )
        )
        nationRepository.add(
            TextModel(
                "https://cdn11.bigcommerce.com/s-2lbnjvmw4d/images/stencil" +
                        "/1280x1280/products/2986/5363/japaneseflag__63748.1628250404.jpg?c=2",
                "japan"
            )
        )
        nationRepository.add(
            TextModel(
                "https://cdn11.bigcommerce.com/s-2lbnjvmw4d/images/stencil/1280x1280/" +
                        "products/2981/4927/italymaterial__41896.1625830280.jpg?c=2",
                " italy"
            )
        )
        nationRepository.add(
            TextModel(
                "https://media.istockphoto.com/id/1209256326/photo/waving-world" +
                        "-flags-silk-satin-texture-3d-illustration.jpg?s=612x612&w=0&k=20&c" +
                        "=bD5s8KDk4xgj8axlhPT36QBftk1im52zsR0coGO_TEs=",
                "korea"
            )
        )
        return nationRepository
    }


}
package uz.allomalar.uz.network.dto

import uz.allomalar.uz.R

class MockData {

    companion object {

        fun getLiniyaDataList(): ArrayList<LiniyaData> {
            val list = ArrayList<LiniyaData>()

            list.add(
                LiniyaData(
                    R.drawable.al_xorazmiy,
                    "Пальма еги ишлаб чикариш линияси",
                    "есть в складе1",
                    "$320 000",
                    "350 000 000 сум"
                )
            )
            list.add(
                LiniyaData(
                    R.drawable.beruniy,
                    "Пальма еги ишлаб чикариш линияси",
                    "есть в складе2",
                    "$320 000",
                    "350 000 000 сум"
                )
            )
            list.add(
                LiniyaData(
                    R.drawable.bobur,
                    "Пальма еги ишлаб чикариш линияси",
                    "есть в складе3",
                    "$320 000",
                    "350 000 000 сум"
                )
            )
            list.add(
                LiniyaData(
                    R.drawable.navoiy,
                    "Пальма еги ишлаб чикариш линияси",
                    "есть в складе4",
                    "$320 000",
                    "350 000 000 сум"
                )
            )

            return list
        }

        fun getDiscountDataList(): ArrayList<DiscountData> {
            val list = ArrayList<DiscountData>()

            list.add(
                DiscountData(
                    R.drawable.al_xorazmiy, "3 қаватли 12 подносли печ",
                    "есть в складе", "$32 000", "$38 000", "35 000 000 сум"
                )
            )
            list.add(
                DiscountData(
                    R.drawable.beruniy, "3 қаватли 12 подносли печ2",
                    "есть в складе", "$32 000", "$38 000", "35 000 000 сум"
                )
            )
            list.add(
                DiscountData(
                    R.drawable.bobur, "3 қаватли 12 подносли печ3",
                    "есть в складе", "$32 000", "$38 000", "35 000 000 сум"
                )
            )
            list.add(
                DiscountData(
                    R.drawable.navoiy, "3 қаватли 12 подносли печ4",
                    "есть в складе", "$32 000", "$38 000", "35 000 000 сум"
                )
            )

            return list
        }

        fun getOurWorkDataList(): ArrayList<OurWorkData> {

            val list = ArrayList<OurWorkData>()

            list.add(OurWorkData(R.drawable.al_xorazmiy, "Lonking CDM 6240"))
            list.add(OurWorkData(R.drawable.beruniy, "Lonking CDM 6240"))
            list.add(OurWorkData(R.drawable.bobur, "Lonking CDM 6240"))
            list.add(OurWorkData(R.drawable.navoiy, "Lonking CDM 6240"))

            return list
        }

        fun getArtictDataList(): ArrayList<ArtictData> {
            val list = ArrayList<ArtictData>()

            list.add(
                ArtictData(
                    R.drawable.al_xorazmiy,
                    "10.10.2020",
                    "Fusce purus tristique aliquam velit sociis gravida.."
                )
            )
            list.add(
                ArtictData(
                    R.drawable.beruniy,
                    "10.10.2020",
                    "Fusce purus tristique aliquam velit sociis gravida.."
                )
            )
            list.add(
                ArtictData(
                    R.drawable.bobur,
                    "10.10.2020",
                    "Fusce purus tristique aliquam velit sociis gravida.."
                )
            )
            list.add(
                ArtictData(
                    R.drawable.navoiy,
                    "10.10.2020",
                    "Fusce purus tristique aliquam velit sociis gravida.."
                )
            )

            return list
        }

        fun getDataSetListList(): List<DataSetList> {
            val list = ArrayList<DataSetList>()

            list.add(
                DataSetList(
                    "https://www.youtube.com/watch?v=KTz44IMExS0&list=PLiLF04XuMmchXfyGXTZfGmq4ANGR13emi",
                    "Ибн Сино ҳақида 10 та факт",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/watch?v=oLl0dDn5tII&list=PLiLF04XuMmchXfyGXTZfGmq4ANGR13emi&index=2",
                    "Нажмиддин Кубро ҳақида 10 та факт",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/watch?v=8RUL22XUsks&list=PLiLF04XuMmchXfyGXTZfGmq4ANGR13emi&index=3",
                    "Имом Мотуридий ҳақида 10 та факт",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/watch?v=pIHVB4whWXg&list=PLiLF04XuMmchXfyGXTZfGmq4ANGR13emi&index=4",
                    "Абу Райҳон Беруний ҳақида 10 та факт",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/watch?v=IRIV9a9pUJQ&list=PLiLF04XuMmchXfyGXTZfGmq4ANGR13emi&index=5",
                    "Алишер Навоий ҳақида 10 та факт",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/watch?v=ssNQzu3Nmi0&list=PLiLF04XuMmchXfyGXTZfGmq4ANGR13emi&index=6",
                    "Маҳмуд Замахшарий ҳақида 10 та факт",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/watch?v=qIzHmqBEUdY&list=PLiLF04XuMmchXfyGXTZfGmq4ANGR13emi&index=7",
                    "Муҳаммад Хоразмий ҳақида 10 та факт",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/watch?v=M73pfEuQP_o&list=PLiLF04XuMmchXfyGXTZfGmq4ANGR13emi&index=8",
                    "Мирзо Улуғбек ҳақида 10 та факт",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/watch?v=Ayu3sPk1Y5Q&list=PLiLF04XuMmchXfyGXTZfGmq4ANGR13emi&index=9",
                    "Имом Бухорий ҳақида 10 та факт",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/watch?v=UDfjaNnv79U&list=PLiLF04XuMmchXfyGXTZfGmq4ANGR13emi&index=10",
                    "Баҳоуддин Нақшбанд ҳақида 10 та факт",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/watch?v=KHGq9TZEmgU&list=PLiLF04XuMmchXfyGXTZfGmq4ANGR13emi&index=11",
                    "Имом Доримий ҳақида 10 та факт",
                    "10.10.2020"
                )
            )
            list.add(
                DataSetList(
                    "https://www.youtube.com/watch?v=cOwVc0DlAKo&list=PLiLF04XuMmchXfyGXTZfGmq4ANGR13emi&index=12",
                    "БУРҲОНИДДИН МАРҒИНОНИЙ ҲАҚИДА 10 ТА ҲАҚИҚАТ",
                    "10.10.2020"
                )
            )

            return list
        }


        fun getCategoryDataList(): ArrayList<CategoryData> {
            val list = ArrayList<CategoryData>()

            list.add(CategoryData("Категория 1", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 2", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 3", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 4", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 5", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 6", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 7", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 8", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 9", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 10", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 11", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 12", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 13", R.drawable.ic_chevron))
            list.add(CategoryData("Категория 14", R.drawable.ic_chevron))

            return list
        }

        fun getChildDataList(): ArrayList<ChildItem> {

            val childItemList = ArrayList<ChildItem>()

            childItemList.add(ChildItem("Наименование товара 1"))
            childItemList.add(ChildItem("Наименование товара 2"))
            childItemList.add(ChildItem("Наименование товара 3"))
            childItemList.add(ChildItem("Наименование товара 4"))
            childItemList.add(ChildItem("Наименование товара 5"))

            return childItemList
        }

        fun getParentItemList(): ArrayList<ParentItem> {

            val list = ArrayList<ParentItem>()

            list.add(ParentItem("Подкатегория  1", getChildDataList()))
            list.add(ParentItem("Подкатегория  2", getChildDataList()))
            list.add(ParentItem("Подкатегория  3", getChildDataList()))
            list.add(ParentItem("Подкатегория  4", getChildDataList()))
            list.add(ParentItem("Подкатегория  5", getChildDataList()))
            list.add(ParentItem("Подкатегория  6", getChildDataList()))
            list.add(ParentItem("Подкатегория  7", getChildDataList()))
            list.add(ParentItem("Подкатегория  8", getChildDataList()))
            list.add(ParentItem("Подкатегория  9", getChildDataList()))
            list.add(ParentItem("Подкатегория  10", getChildDataList()))
            list.add(ParentItem("Подкатегория  11", getChildDataList()))
            list.add(ParentItem("Подкатегория  12", getChildDataList()))
            list.add(ParentItem("Подкатегория  13", getChildDataList()))
            list.add(ParentItem("Подкатегория  14", getChildDataList()))
            list.add(ParentItem("Подкатегория  15", getChildDataList()))

            return list
        }

    }

    data class DataSetList(var link: String?, var text: String, val data: String)

    data class OurWorkData(
        var image: Int, var name: String
    )

    data class ArtictData(
        var image: Int, var data: String, var name: String,  var position: Int = 0
    )

    data class DiscountData(
        val image: Int,
        val product: String,
        val productAbout: String,
        val cost: String,
        val costOld: String,
        val costSum: String


    )

    data class CategoryData(
        var name: String, var image: Int
    )

    data class LiniyaData(
        var image: Int,
        var textLiniya: String,
        var textLiniyaAbout: String,
        val textCost: String,
        var textCostSum: String
    )

    data class ChildItem(
        var childItemTitle: String
    )

    data class ParentItem(
        var parentItemTitle: String,
        var childItemList: List<ChildItem>
    )

}
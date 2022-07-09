package com.sachin.repository

import com.sachin.models.APIResponse
import com.sachin.models.Hero

const val NEXT_PAGE_KEY = "nextPage"
const val PREVIOUS_PAGE_KEY = "prevPage"
class HeroRepositoryImpl: HeroRepository {
    override val heroes: Map<Int, List<Hero>> by lazy {
        mapOf(
            1 to page1,
            2 to page2,
            3 to page3,
            4 to page4,
            5 to page5
        )
    }

    override val page1 = listOf(
        Hero(
            id = 1,
            name = "Spider Man",
            image = "/images/spiderman.jpg",
            about = "spider-like abilities, science genius Peter Parker swings above it all as Spider-Man, costumed champion of the innocent who lives and fights with the wisdom of “With Great Power Comes Great Responsibility!”",
            rating = 5.0,
            power = 98,
            month = "Aug",
            day = "23th",
            family = listOf(
                "Mary",
                "Richard",
                "Teresa",
                "Watson",
            ),
            abilities = listOf(
                "Speed",
                "Healing",
                "Durability",
                "Crawling"
            ),
            aliases = listOf(
                "Prodigy",
                "Ricochet",
                "Tiger",
                "Ricochet"
            )
        ),
        Hero(
            id = 2,
            name = "Doctor Strange",
            image = "/images/doctorstrange.jpg",
            about = "Doctor Strange’s powers and abilities originally stemmed from tapping into otherworldly entities and planes, chief among them the Vishanti, a triumvirate of powerful beings who granted magic-users temporary access to their essences through spells. Strange called upon the Vishanti throughout his early years as a magician to aid in his battles against various forms of magical danger and creatures, culminating in him receiving the title of Sorcerer Supreme when the Ancient One relinquished it upon his death.",
            rating = 5.0,
            power = 98,
            month = "Oct",
            day = "10th",
            family = listOf(
                "Beverly",
                "Eugene",
                "Donna",
                "Victor",
                "Cela"
            ),
            abilities = listOf(
                "Teleportation",
                "Chronokinesis",
                "Magic",
                "Energy Manipulation"
            ),
            aliases = listOf(
                "Sorcerer",
                "Vincent",
                "Red"
            )
        ),
        Hero(
            id = 3,
            name = "Thor",
            image = "/images/thor.jpg",
            about = "The very skies tremble in his presence. He commands the mystical hammer Mjolnir to protect Asgard and Earth. He is the son of Odin, Prince of Asgard. He is the God of Thunder. He is Thor.",
            rating = 4.5,
            power = 92,
            month = "Mar",
            day = "28th",
            family = listOf(
                "Gaea",
                "Odin",
                "Loki",
                "Balder"
            ),
            abilities = listOf(
                "Odinpower",
                "Sword-Fighting",
                "Strength",
                "Reflexes"
            ),
            aliases = listOf(
                "Donner",
                "Siegmund",
                "Siegfried"
            )
        )
    )
    override val page2 = listOf(
        Hero(
            id = 4,
            name = "Wanda",
            image = "/images/wanda.jpg",
            about = "Although much of the Scarlet Witch’s true origins remain elusive to her thanks to manipulations by others, she can still recall her early days as a child with her twin brother Pietro. The two lived on Wundagore Mountain in Eastern Europe, believing themselves born as mutants to a Romani couple named the Maximoffs. Given the name Wanda, she lived for a short time in childish innocence until local troubles involving her parents separated her and her brother from them and forced her to hide her growing powers.",
            rating = 4.9,
            power = 95,
            month = "Mar",
            day = "27th",
            family = listOf(
                "Magda",
                "Marya",
                "Django",
                "Anya",
                "Lorna"
            ),
            abilities = listOf(
                "Magic",
                "Mind Control",
                "Reality Warping",
                "Deceased Spirits"
            ),
            aliases = listOf(
                "Gypsy",
                "Ana",
                "Frank"
            )
        ),
        Hero(
            id = 5,
            name = "Wong",
            image = "/images/wong.jpg",
            about = "Behind every great Sorcerer Supreme, there?s a great valet by the name of Wong. At least that?s true for Doctor Stephen Strange, who wouldn?t be nearly as successful as he is without his faithful sidekick and close friend. Together they fight the supernatural forces of evil and entities who are so heinous and ancient, that they can neither be pronounced by the human tongue nor understood by the human mind.",
            rating = 4.9,
            power = 95,
            month = "Mar",
            day = "31st",
            family = listOf(
                "Hamir",
                "Kan"
            ),
            abilities = listOf(
                "Magic",
                "Strength",
                "Martial Artist"
            ),
            aliases = listOf(
                "Wongshot"
            )
        ),
        Hero(
            id = 6,
            name = "Iron Man",
            image = "/images/ironman.jpg",
            about = "Tony Stark is the wealthy son of industrialist and weapons manufacturer Howard Stark and his wife, Maria. Tony grew up a genius with a brilliant mind for technology and inventions and, naturally, followed in his father’s footsteps, inheriting Stark Industries upon his parents’ untimely death. Tony designed many weapons of war for Stark Industries, far beyond what any other company was creating, while living the lifestyle of a bon vivant.",
            rating = 4.9,
            power = 95,
            month = "Jul",
            day = "25th",
            family = listOf(
                "Maria",
                "Carbonell",
                "Howard",
                "Edward",
                "Walter"
            ),
            abilities = listOf(
                "Genius Intelligence",
                "Strength",
                "Regeneration",
                "Senses"
            ),
            aliases = listOf(
                "Anthony",
                "Golden"
            )
        )
    )
    override val page3 = listOf(
        Hero(
            id = 7,
            name = "Captain America",
            image = "/images/captainamerica2.jpg",
            about = "From the dark days of world war to the explosive challenges of today, Super-Soldier Captain America stands ready as a shining sentinel of liberty to shield the oppressed and fight for freedom everywhere.",
            rating = 4.2,
            power = 92,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Sarah",
                "Joseph"
            ),
            abilities = listOf(
                "Agility",
                "Stamina",
                "Durability",
                "Reflexes",
                "Strength"
            ),
            aliases = listOf(
                "Blondie",
                "Yeoman ",
                "Roger",
                "Nomad"
            )
        ),
        Hero(
            id = 8,
            name = "Hulk",
            image = "/images/hulk.jpg",
            about = "Scientist Bruce Banner’s inner turmoil transforms him into the mean, green rage machine called the Hulk.",
            rating = 4.5,
            power = 97,
            month = "Oct",
            day = "27th",
            family = listOf(
                "Rebecca",
                "Brian"
            ),
            abilities = listOf(
                "Shape Alteration",
                "Healing Factor",
                "Strength"
            ),
            aliases = listOf(
                "Robert Bruce",
                "Green Scar",
                "Haarg",
                "Professor",
                "Mechano"
            )
        ),
        Hero(
            id = 9,
            name = "Groot",
            image = "/images/groot.jpg",
            about = "Hailing from the Branch Worlds’ Planet X, Groot is part of a species called Groot, so his name is also the title of his taxonomic classification. From the time he was a sapling, Groot was destined to protect the rights of the downtrodden. He campaigned for the Undergrowth, anthropomorphic animals and fungi who helped maintain Planet X’s ecosystem by performing menial tasks. Groot’s noble campaign drew the rancor of the other Groots and he ended up leaving his home world.",
            rating = 4.5,
            power = 96,
            month = "Sep",
            day = "15th",
            family = listOf(
                "King Groot"
            ),
            abilities = listOf(
                "Healing Factor",
                "Strength"
            ),
            aliases = listOf(
                "King Groot",
                "Royal Majesty",
                "Planet X"
            )
        )
    )
    override val page4 = listOf(
        Hero(
            id = 10,
            name = "Thanos",
            image = "/images/thanos.jpg",
            about = "He is perhaps the most evil, bloodthirsty, and powerful villain in the universe—so powerful that religious sects have worshipped him as a god. His enemies include nearly every Super Hero in existence. He is obsessed with Goddess Death and has waged genocidal campaigns in an attempt to placate her. Most famously, he has attempted to conquer the universe by wielding the Infinity Gauntlet. He is the Mad Titan.",
            rating = 5.0,
            power = 100,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Sui-San",
                "Eros",
                "Kronos",
                "Nebula"

            ),
            abilities = listOf(
                "Black Arts",
                "Immortality",
                "Magic",
                "Mysticism",
                "Strength"
            ),
            aliases = listOf(
                "Mad Titan",
                "Master",
                "Thanos Rex",
                "Masterlord",
                "Overmaster"
            )
        ),
        Hero(
            id = 11,
            name = "Black Widow",
            image = "/images/blackwidow.jpg",
            about = "Gifted spy Natasha Romanoff is more than worthy of her moniker, Black Widow.\n" +
                    "\n" +
                    "Ruthless, efficient, and exceptionally skilled, Natasha strikes fear into the hearts of her enemies. Although she once operated on the side of evil, her innate heroism allowed her to overcome her upbringing and defect, setting her on a lifelong path of redemption.",
            rating = 3.9,
            power = 98,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Vindiktor",
                "Alexi"
            ),
            abilities = listOf(
                "Aging",
                "Durability",
                "Strength"
            ),
            aliases = listOf(
                "Natalia",
                "Nat",
                "Tsarina",
                "Natuska",
                "Czarina"
            )
        ),
        Hero(
            id = 12,
            name = "Black Panther",
            image = "/images/blackpanther.jpg",
            about = "For generations, the people of Wakanda have followed and worshipped the Black Panther, a superior warrior granted extra abilities by the Panther God upon proving him or herself worthy in a combat tournament open to all Wakandans.",
            rating = 3.4,
            power = 95,
            month = "Jan",
            day = "1st",
            family = listOf(
                "N'Yami",
                "Romanda",
                "T'Chaka",
                "Jakarra"
            ),
            abilities = listOf(
                "Night Vision",
                "Hand Combat",
                "Strength"
            ),
            aliases = listOf(
                "Luke",
                "Black Leopard",
                "Nubian Prince",
                "The Client"
            )
        )
    )
    override val page5 = listOf(
        Hero(
            id = 13,
            name = "HawkEye",
            image = "/images/hawkeye.jpg",
            about = "Earth’s Mightiest Marksman, Clint Barton employs a devil-may-care attitude and mastery over one of civilization’s oldest weapons as the Avengers’ ace archer, Hawkeye. A mainstay of the hero team, Barton brings along an undying heroic spirit and the ability to hit any target.",
            rating = 4.8,
            power = 99,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Edith",
                "Harold"
            ),
            abilities = listOf(
                "Hand Combat",
                "Marksmanship"
            ),
            aliases = listOf(
                "Clint",
                "Dr.Rogers",
                "Golden Archer"
            )
        ),
        Hero(
            id = 14,
            name = "Ant Man",
            image = "/images/antman.jpg",
            about = "A good man with a criminal past, Scott Lang builds upon the legacy of one of the founding Avengers as the size-changing hero Ant-Man.",
            rating = 5.0,
            power = 90,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Ruth Lang",
                "Peggy Rae",
                "Cassandra"
            ),
            abilities = listOf(
                "Shape Alteration",
                "Intelligence",
                "Energy Blasts"
            ),
            aliases = listOf(
                "Myrmidon",
                "Scottie"
            )
        ),
        Hero(
            id = 15,
            name = "Gamora",
            image = "/images/gamora.jpg",
            about = "After seeing the Zen-Whoberi people nearly completely wiped from existence by the Badoon, Thanos took the lone survivor and decided to turn her into the deadliest woman in the universe. That woman is Gamora, an incredibly adept student in the art of combat, war, and death, who has done both evil and good during her galaxy-wide travels. Among her victories: keeping reality safe alongside Adam Warlock, Infinity Watch, and the Guardians of the Galaxy, her current team-turned-family.",
            rating = 4.5,
            power = 90,
            month = "Jan",
            day = "1st",
            family = listOf(
                "Unknown"
            ),
            abilities = listOf(
                "Precognition",
                "Durability",
                "Sword-Fight"
            ),
            aliases = listOf(
                "Bambi Long",
                "Astral Samuri"
            )
        )
    )

    override suspend fun getAllHeroes(page: Int): APIResponse {
       return APIResponse(
           success = true,
           message = "ok",
           prevPage = calculatePage(page = page)[PREVIOUS_PAGE_KEY],
           nextPage = calculatePage(page = page)[NEXT_PAGE_KEY],
           heroes = heroes[page]!!,
           lastUpdated = System.currentTimeMillis()
       )
    }

    private fun calculatePage(page: Int) : Map<String,Int?>{
        var prevPage : Int? = page
        var nextPage : Int? = page
        if(page in 1..4){
            nextPage= nextPage?.plus(1)
        }
        if(page in 2..5){
            prevPage= prevPage?.minus(1)
        }
        if(page == 1){
            prevPage = null
        }
        if(page == 5){
            nextPage = null
        }
        return mapOf(PREVIOUS_PAGE_KEY to prevPage, NEXT_PAGE_KEY to nextPage)
    }

    override suspend fun searchHeroes(name: String?): APIResponse {
        return APIResponse(
            success = true,
            message = "ok",
            heroes = findHeroes(query = name)

        )
    }

    private fun findHeroes(query: String?):List<Hero>{
        val founded = mutableListOf<Hero>()
        return if (!query.isNullOrEmpty()) {
            heroes.forEach { (_, heroes) ->
                heroes.forEach { hero ->
                    if (hero.name.lowercase().contains(query.lowercase())) {
                        founded.add(hero)
                    }
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}



import com.google.gson.annotations.SerializedName
data class ScheduleBean(
    @SerializedName("content")
    val content: Content = Content(),
    @SerializedName("status")
    val status: Int = 0
) {
    data class Content(
        @SerializedName("meta")
        val meta: Meta = Meta(),
        @SerializedName("tableData")
        val tableData: TableData = TableData(),
        @SerializedName("title")
        val title: String = ""
    ) {
        data class Meta(
            @SerializedName("assets")
            val assets: Assets = Assets(),
            @SerializedName("dropdowns")
            val dropdowns: List<Dropdown> = listOf(),
            @SerializedName("strings")
            val strings: Strings = Strings(),
            @SerializedName("tabs")
            val tabs: List<Tab> = listOf()
        ) {
            data class Assets(
                @SerializedName("undefinedTeamLogo")
                val undefinedTeamLogo: UndefinedTeamLogo = UndefinedTeamLogo()
            ) {
                data class UndefinedTeamLogo(
                    @SerializedName("src")
                    val src: String = ""
                )
            }

            data class Dropdown(
                @SerializedName("name")
                val name: String = "",
                @SerializedName("options")
                val options: List<Option> = listOf()
            ) {
                data class Option(
                    @SerializedName("archivedStaticScheduleData")
                    val archivedStaticScheduleData: String = "",
                    @SerializedName("archivedStaticStandingsData")
                    val archivedStaticStandingsData: String = "",
                    @SerializedName("default")
                    val default: Boolean = false,
                    @SerializedName("id")
                    val id: Any = Any(),
                    @SerializedName("name")
                    val name: String = "",
                    @SerializedName("seriesId")
                    val seriesId: String = "",
                    @SerializedName("staticPlayersData")
                    val staticPlayersData: String = "",
                    @SerializedName("teamSite")
                    val teamSite: String = ""
                )
            }

            data class Strings(
                @SerializedName("allStartWeekend")
                val allStartWeekend: String = "",
                @SerializedName("allTeams")
                val allTeams: String = "",
                @SerializedName("disclaimer")
                val disclaimer: String = "",
                @SerializedName("encoreText")
                val encoreText: String = "",
                @SerializedName("final")
                val `final`: String = "",
                @SerializedName("grandFinals")
                val grandFinals: String = "",
                @SerializedName("live")
                val live: String = "",
                @SerializedName("matchDetails")
                val matchDetails: String = "",
                @SerializedName("nextWeek")
                val nextWeek: String = "",
                @SerializedName("now")
                val now: String = "",
                @SerializedName("playoffs")
                val playoffs: String = "",
                @SerializedName("previousWeek")
                val previousWeek: String = "",
                @SerializedName("regularSeason")
                val regularSeason: String = "",
                @SerializedName("soldOut")
                val soldOut: String = "",
                @SerializedName("tickets")
                val tickets: String = "",
                @SerializedName("ticketsStatusText")
                val ticketsStatusText: TicketsStatusText = TicketsStatusText(),
                @SerializedName("title2020")
                val title2020: String = "",
                @SerializedName("watch")
                val watch: String = "",
                @SerializedName("weeks")
                val weeks: String = ""
            ) {
                data class TicketsStatusText(
                    @SerializedName("canceled")
                    val canceled: List<Canceled> = listOf(),
                    @SerializedName("normal")
                    val normal: List<Normal> = listOf(),
                    @SerializedName("postponed")
                    val postponed: List<Postponed> = listOf(),
                    @SerializedName("soldout")
                    val soldout: List<Soldout> = listOf(),
                    @SerializedName("unavailable")
                    val unavailable: List<Unavailable> = listOf()
                ) {
                    data class Canceled(
                        @SerializedName("ACL")
                        val aCL: ACL = ACL(),
                        @SerializedName("ContentTypeUid")
                        val contentTypeUid: String = "",
                        @SerializedName("createdAt")
                        val createdAt: String = "",
                        @SerializedName("createdBy")
                        val createdBy: String = "",
                        @SerializedName("InProgress")
                        val inProgress: Boolean = false,
                        @SerializedName("key")
                        val key: String = "",
                        @SerializedName("locale")
                        val locale: String = "",
                        @SerializedName("publishDetails")
                        val publishDetails: PublishDetails = PublishDetails(),
                        @SerializedName("tags")
                        val tags: List<Any> = listOf(),
                        @SerializedName("title")
                        val title: String = "",
                        @SerializedName("uid")
                        val uid: String = "",
                        @SerializedName("updatedAt")
                        val updatedAt: String = "",
                        @SerializedName("updatedBy")
                        val updatedBy: String = "",
                        @SerializedName("value")
                        val value: String = "",
                        @SerializedName("Version")
                        val version: Int = 0
                    ) {
                        class ACL(
                        )

                        data class PublishDetails(
                            @SerializedName("environment")
                            val environment: String = "",
                            @SerializedName("locale")
                            val locale: String = "",
                            @SerializedName("time")
                            val time: String = "",
                            @SerializedName("user")
                            val user: String = ""
                        )
                    }

                    data class Normal(
                        @SerializedName("ACL")
                        val aCL: ACL = ACL(),
                        @SerializedName("ContentTypeUid")
                        val contentTypeUid: String = "",
                        @SerializedName("createdAt")
                        val createdAt: String = "",
                        @SerializedName("createdBy")
                        val createdBy: String = "",
                        @SerializedName("InProgress")
                        val inProgress: Boolean = false,
                        @SerializedName("key")
                        val key: String = "",
                        @SerializedName("locale")
                        val locale: String = "",
                        @SerializedName("publishDetails")
                        val publishDetails: PublishDetails = PublishDetails(),
                        @SerializedName("tags")
                        val tags: List<Any> = listOf(),
                        @SerializedName("title")
                        val title: String = "",
                        @SerializedName("uid")
                        val uid: String = "",
                        @SerializedName("updatedAt")
                        val updatedAt: String = "",
                        @SerializedName("updatedBy")
                        val updatedBy: String = "",
                        @SerializedName("value")
                        val value: String = "",
                        @SerializedName("Version")
                        val version: Int = 0
                    ) {
                        class ACL(
                        )

                        data class PublishDetails(
                            @SerializedName("environment")
                            val environment: String = "",
                            @SerializedName("locale")
                            val locale: String = "",
                            @SerializedName("time")
                            val time: String = "",
                            @SerializedName("user")
                            val user: String = ""
                        )
                    }

                    data class Postponed(
                        @SerializedName("ACL")
                        val aCL: ACL = ACL(),
                        @SerializedName("ContentTypeUid")
                        val contentTypeUid: String = "",
                        @SerializedName("createdAt")
                        val createdAt: String = "",
                        @SerializedName("createdBy")
                        val createdBy: String = "",
                        @SerializedName("InProgress")
                        val inProgress: Boolean = false,
                        @SerializedName("key")
                        val key: String = "",
                        @SerializedName("locale")
                        val locale: String = "",
                        @SerializedName("publishDetails")
                        val publishDetails: PublishDetails = PublishDetails(),
                        @SerializedName("tags")
                        val tags: List<Any> = listOf(),
                        @SerializedName("title")
                        val title: String = "",
                        @SerializedName("uid")
                        val uid: String = "",
                        @SerializedName("updatedAt")
                        val updatedAt: String = "",
                        @SerializedName("updatedBy")
                        val updatedBy: String = "",
                        @SerializedName("value")
                        val value: String = "",
                        @SerializedName("Version")
                        val version: Int = 0
                    ) {
                        class ACL(
                        )

                        data class PublishDetails(
                            @SerializedName("environment")
                            val environment: String = "",
                            @SerializedName("locale")
                            val locale: String = "",
                            @SerializedName("time")
                            val time: String = "",
                            @SerializedName("user")
                            val user: String = ""
                        )
                    }

                    data class Soldout(
                        @SerializedName("ACL")
                        val aCL: ACL = ACL(),
                        @SerializedName("ContentTypeUid")
                        val contentTypeUid: String = "",
                        @SerializedName("createdAt")
                        val createdAt: String = "",
                        @SerializedName("createdBy")
                        val createdBy: String = "",
                        @SerializedName("InProgress")
                        val inProgress: Boolean = false,
                        @SerializedName("locale")
                        val locale: String = "",
                        @SerializedName("publishDetails")
                        val publishDetails: PublishDetails = PublishDetails(),
                        @SerializedName("tags")
                        val tags: List<Any> = listOf(),
                        @SerializedName("title")
                        val title: String = "",
                        @SerializedName("uid")
                        val uid: String = "",
                        @SerializedName("updatedAt")
                        val updatedAt: String = "",
                        @SerializedName("updatedBy")
                        val updatedBy: String = "",
                        @SerializedName("value")
                        val value: String = "",
                        @SerializedName("Version")
                        val version: Int = 0
                    ) {
                        class ACL(
                        )

                        data class PublishDetails(
                            @SerializedName("environment")
                            val environment: String = "",
                            @SerializedName("locale")
                            val locale: String = "",
                            @SerializedName("time")
                            val time: String = "",
                            @SerializedName("user")
                            val user: String = ""
                        )
                    }

                    data class Unavailable(
                        @SerializedName("ACL")
                        val aCL: ACL = ACL(),
                        @SerializedName("ContentTypeUid")
                        val contentTypeUid: String = "",
                        @SerializedName("createdAt")
                        val createdAt: String = "",
                        @SerializedName("createdBy")
                        val createdBy: String = "",
                        @SerializedName("InProgress")
                        val inProgress: Boolean = false,
                        @SerializedName("key")
                        val key: String = "",
                        @SerializedName("locale")
                        val locale: String = "",
                        @SerializedName("publishDetails")
                        val publishDetails: PublishDetails = PublishDetails(),
                        @SerializedName("tags")
                        val tags: List<Any> = listOf(),
                        @SerializedName("title")
                        val title: String = "",
                        @SerializedName("uid")
                        val uid: String = "",
                        @SerializedName("updatedAt")
                        val updatedAt: String = "",
                        @SerializedName("updatedBy")
                        val updatedBy: String = "",
                        @SerializedName("value")
                        val value: String = "",
                        @SerializedName("Version")
                        val version: Int = 0
                    ) {
                        class ACL(
                        )

                        data class PublishDetails(
                            @SerializedName("environment")
                            val environment: String = "",
                            @SerializedName("locale")
                            val locale: String = "",
                            @SerializedName("time")
                            val time: String = "",
                            @SerializedName("user")
                            val user: String = ""
                        )
                    }
                }
            }

            data class Tab(
                @SerializedName("id")
                val id: String = "",
                @SerializedName("name")
                val name: String = "",
                @SerializedName("options")
                val options: Options = Options(),
                @SerializedName("selected")
                val selected: Boolean = false,
                @SerializedName("stage")
                val stage: String = "",
                @SerializedName("subtabs")
                val subtabs: List<Subtab> = listOf(),
                @SerializedName("type")
                val type: String = ""
            ) {
                data class Options(
                    @SerializedName("link")
                    val link: Boolean = false,
                    @SerializedName("url")
                    val url: String = ""
                )

                data class Subtab(
                    @SerializedName("endDate")
                    val endDate: String = "",
                    @SerializedName("id")
                    val id: Int = 0,
                    @SerializedName("name")
                    val name: String = "",
                    @SerializedName("selected")
                    val selected: Boolean = false,
                    @SerializedName("startDate")
                    val startDate: String = ""
                )
            }
        }

        data class TableData(
            @SerializedName("endDate")
            val endDate: String = "",
            @SerializedName("events")
            val events: List<Event> = listOf(),
            @SerializedName("name")
            val name: String = "",
            @SerializedName("pagination")
            val pagination: Pagination = Pagination(),
            @SerializedName("presentedBy")
            val presentedBy: String = "",
            @SerializedName("sponsor")
            val sponsor: List<Any> = listOf(),
            @SerializedName("startDate")
            val startDate: String = "",
            @SerializedName("subtitle")
            val subtitle: String = "",
            @SerializedName("weekNumber")
            val weekNumber: Int = 0
        ) {
            data class Event(
                @SerializedName("eventBanner")
                val eventBanner: EventBanner = EventBanner(),
                @SerializedName("matches")
                val matches: List<Matche> = listOf()
            ) {
                data class EventBanner(
                    @SerializedName("backgroundImageUrl")
                    val backgroundImageUrl: String = "",
                    @SerializedName("backgroundVideos")
                    val backgroundVideos: List<Any> = listOf(),
                    @SerializedName("bottomBackgroundColor")
                    val bottomBackgroundColor: String = "",
                    @SerializedName("featuredImage")
                    val featuredImage: String = "",
                    @SerializedName("headings")
                    val headings: Headings = Headings(),
                    @SerializedName("hostedBy")
                    val hostedBy: String = "",
                    @SerializedName("hostingTeam")
                    val hostingTeam: HostingTeam = HostingTeam(),
                    @SerializedName("sponsors")
                    val sponsors: List<Any> = listOf(),
                    @SerializedName("ticket")
                    val ticket: Ticket = Ticket(),
                    @SerializedName("title")
                    val title: String = "",
                    @SerializedName("venue")
                    val venue: Venue = Venue()
                ) {
                    data class Headings(
                        @SerializedName("primary")
                        val primary: Primary = Primary(),
                        @SerializedName("secondary")
                        val secondary: Secondary = Secondary(),
                        @SerializedName("tertiary")
                        val tertiary: Tertiary = Tertiary()
                    ) {
                        data class Primary(
                            @SerializedName("color")
                            val color: String = "",
                            @SerializedName("text")
                            val text: String = ""
                        )

                        data class Secondary(
                            @SerializedName("color")
                            val color: String = "",
                            @SerializedName("text")
                            val text: String = ""
                        )

                        data class Tertiary(
                            @SerializedName("color")
                            val color: String = "",
                            @SerializedName("text")
                            val text: String = ""
                        )
                    }

                    data class HostingTeam(
                        @SerializedName("link")
                        val link: Link = Link(),
                        @SerializedName("longName")
                        val longName: List<String> = listOf(),
                        @SerializedName("shortName")
                        val shortName: String = "",
                        @SerializedName("teamId")
                        val teamId: Int = 0,
                        @SerializedName("teamLogo")
                        val teamLogo: List<TeamLogo> = listOf()
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String = "",
                            @SerializedName("title")
                            val title: String = ""
                        )

                        data class TeamLogo(
                            @SerializedName("teamIconPng")
                            val teamIconPng: TeamIconPng = TeamIconPng(),
                            @SerializedName("teamIconSvg")
                            val teamIconSvg: TeamIconSvg = TeamIconSvg(),
                            @SerializedName("teamIconUsage")
                            val teamIconUsage: String = ""
                        ) {
                            data class TeamIconPng(
                                @SerializedName("src")
                                val src: String = ""
                            )

                            data class TeamIconSvg(
                                @SerializedName("src")
                                val src: String = ""
                            )
                        }
                    }

                    data class Ticket(
                        @SerializedName("link")
                        val link: Link = Link(),
                        @SerializedName("title")
                        val title: String = ""
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String = "",
                            @SerializedName("title")
                            val title: String = ""
                        )
                    }

                    data class Venue(
                        @SerializedName("link")
                        val link: Link = Link(),
                        @SerializedName("location")
                        val location: String = "",
                        @SerializedName("name")
                        val name: String = "",
                        @SerializedName("title")
                        val title: String = ""
                    ) {
                        data class Link(
                            @SerializedName("href")
                            val href: String = "",
                            @SerializedName("title")
                            val title: String = ""
                        )
                    }
                }

                data class Matche(
                    @SerializedName("broadcastChannels")
                    val broadcastChannels: List<BroadcastChannel> = listOf(),
                    @SerializedName("competitors")
                    val competitors: List<Competitor> = listOf(),
                    @SerializedName("endDate")
                    val endDate: Long = 0,
                    @SerializedName("id")
                    val id: Int = 0,
                    @SerializedName("isEncore")
                    val isEncore: Boolean = false,
                    @SerializedName("link")
                    val link: String = "",
                    @SerializedName("scores")
                    val scores: List<Int> = listOf(),
                    @SerializedName("startDate")
                    val startDate: Long = 0,
                    @SerializedName("status")
                    val status: String = "",
                    @SerializedName("tickets")
                    val tickets: Tickets = Tickets(),
                    @SerializedName("venue")
                    val venue: Venue = Venue()
                ) {
                    data class BroadcastChannel(
                        @SerializedName("colorLogoUrl")
                        val colorLogoUrl: ColorLogoUrl = ColorLogoUrl(),
                        @SerializedName("grayLogoUrl")
                        val grayLogoUrl: GrayLogoUrl = GrayLogoUrl(),
                        @SerializedName("link")
                        val link: Link = Link(),
                        @SerializedName("linkable")
                        val linkable: Boolean = false,
                        @SerializedName("title")
                        val title: String = ""
                    ) {
                        data class ColorLogoUrl(
                            @SerializedName("src")
                            val src: String = ""
                        )

                        data class GrayLogoUrl(
                            @SerializedName("src")
                            val src: String = ""
                        )

                        data class Link(
                            @SerializedName("href")
                            val href: String = "",
                            @SerializedName("title")
                            val title: String = ""
                        )
                    }

                    data class Competitor(
                        @SerializedName("abbreviatedName")
                        val abbreviatedName: String = "",
                        @SerializedName("icon")
                        val icon: String = "",
                        @SerializedName("id")
                        val id: Int = 0,
                        @SerializedName("logo")
                        val logo: String = "",
                        @SerializedName("name")
                        val name: String = ""
                    )

                    data class Tickets(
                        @SerializedName("ACL")
                        val aCL: ACL = ACL(),
                        @SerializedName("ContentTypeUid")
                        val contentTypeUid: String = "",
                        @SerializedName("createdAt")
                        val createdAt: String = "",
                        @SerializedName("createdBy")
                        val createdBy: String = "",
                        @SerializedName("InProgress")
                        val inProgress: Boolean = false,
                        @SerializedName("link")
                        val link: Link = Link(),
                        @SerializedName("locale")
                        val locale: String = "",
                        @SerializedName("publishDetails")
                        val publishDetails: PublishDetails = PublishDetails(),
                        @SerializedName("status")
                        val status: String = "",
                        @SerializedName("statusText")
                        val statusText: List<StatusText> = listOf(),
                        @SerializedName("tags")
                        val tags: List<Any> = listOf(),
                        @SerializedName("title")
                        val title: String = "",
                        @SerializedName("uid")
                        val uid: String = "",
                        @SerializedName("updatedAt")
                        val updatedAt: String = "",
                        @SerializedName("updatedBy")
                        val updatedBy: String = "",
                        @SerializedName("Version")
                        val version: Int = 0
                    ) {
                        class ACL(
                        )

                        data class Link(
                            @SerializedName("href")
                            val href: String = "",
                            @SerializedName("title")
                            val title: String = ""
                        )

                        data class PublishDetails(
                            @SerializedName("environment")
                            val environment: String = "",
                            @SerializedName("locale")
                            val locale: String = "",
                            @SerializedName("time")
                            val time: String = "",
                            @SerializedName("user")
                            val user: String = ""
                        )

                        data class StatusText(
                            @SerializedName("ACL")
                            val aCL: ACL = ACL(),
                            @SerializedName("ContentTypeUid")
                            val contentTypeUid: String = "",
                            @SerializedName("createdAt")
                            val createdAt: String = "",
                            @SerializedName("createdBy")
                            val createdBy: String = "",
                            @SerializedName("InProgress")
                            val inProgress: Boolean = false,
                            @SerializedName("key")
                            val key: String = "",
                            @SerializedName("locale")
                            val locale: String = "",
                            @SerializedName("publishDetails")
                            val publishDetails: PublishDetails = PublishDetails(),
                            @SerializedName("tags")
                            val tags: List<Any> = listOf(),
                            @SerializedName("title")
                            val title: String = "",
                            @SerializedName("uid")
                            val uid: String = "",
                            @SerializedName("updatedAt")
                            val updatedAt: String = "",
                            @SerializedName("updatedBy")
                            val updatedBy: String = "",
                            @SerializedName("value")
                            val value: String = "",
                            @SerializedName("Version")
                            val version: Int = 0
                        ) {
                            class ACL(
                            )

                            data class PublishDetails(
                                @SerializedName("environment")
                                val environment: String = "",
                                @SerializedName("locale")
                                val locale: String = "",
                                @SerializedName("time")
                                val time: String = "",
                                @SerializedName("user")
                                val user: String = ""
                            )
                        }
                    }

                    data class Venue(
                        @SerializedName("ACL")
                        val aCL: ACL = ACL(),
                        @SerializedName("ContentTypeUid")
                        val contentTypeUid: String = "",
                        @SerializedName("createdAt")
                        val createdAt: String = "",
                        @SerializedName("createdBy")
                        val createdBy: String = "",
                        @SerializedName("image")
                        val image: Any = Any(),
                        @SerializedName("InProgress")
                        val inProgress: Boolean = false,
                        @SerializedName("link")
                        val link: Link = Link(),
                        @SerializedName("locale")
                        val locale: String = "",
                        @SerializedName("location")
                        val location: String = "",
                        @SerializedName("name")
                        val name: String = "",
                        @SerializedName("publishDetails")
                        val publishDetails: PublishDetails = PublishDetails(),
                        @SerializedName("tags")
                        val tags: List<Any> = listOf(),
                        @SerializedName("title")
                        val title: String = "",
                        @SerializedName("uid")
                        val uid: String = "",
                        @SerializedName("updatedAt")
                        val updatedAt: String = "",
                        @SerializedName("updatedBy")
                        val updatedBy: String = "",
                        @SerializedName("Version")
                        val version: Int = 0
                    ) {
                        class ACL(
                        )

                        data class Link(
                            @SerializedName("href")
                            val href: String = "",
                            @SerializedName("title")
                            val title: String = ""
                        )

                        data class PublishDetails(
                            @SerializedName("environment")
                            val environment: String = "",
                            @SerializedName("locale")
                            val locale: String = "",
                            @SerializedName("time")
                            val time: String = "",
                            @SerializedName("user")
                            val user: String = ""
                        )
                    }
                }
            }

            data class Pagination(
                @SerializedName("currentPage")
                val currentPage: Int = 0,
                @SerializedName("nextPage")
                val nextPage: Int = 0,
                @SerializedName("previousPage")
                val previousPage: Int = 0,
                @SerializedName("totalPages")
                val totalPages: Int = 0
            )
        }
    }
}
package br.com.githubapi.domian.model

data class User(
    val login: String = "torvalds",
    val id: Int = 1024025,
    val node_id: String = "MDQ6VXNlcjEwMjQwMjU=",
    val avatar_url: String = "https://avatars.githubusercontent.com/u/1024025?v=4",
    val gravatar_id: String = "",
    val url: String = "https://api.github.com/users/torvalds",
    val html_url: String = "https://github.com/torvalds",
    val followers_url: String = "https://api.github.com/users/torvalds/followers",
    val following_url: String = "https://api.github.com/users/torvalds/following{/other_user}",
    val gists_url: String = "https://api.github.com/users/torvalds/gists{/gist_id}",
    val starred_url: String = "https://api.github.com/users/torvalds/starred{/owner}{/repo}",
    val subscriptions_url: String = "https://api.github.com/users/torvalds/subscriptions",
    val organizations_url: String = "https://api.github.com/users/torvalds/orgs",
    val repos_url: String = "https://api.github.com/users/torvalds/repos",
    val events_url: String = "https://api.github.com/users/torvalds/events{/privacy}",
    val received_events_url: String = "https://api.github.com/users/torvalds/received_events",
    val type: String = "User",
    val site_admin:  Boolean = false,
    val name: String = "Linus Torvalds",
    val company: String = "Linux Foundation",
    val blog: String = "",
    val location: String = "Portland, OR",
    val email: String? = null,
    val hireable: String? = null,
    val bio: String? = null,
    val twitter_username: String? = null,
    val public_repos: Int = 7,
    val public_gists: Int = 0,
    val followers: Int = 195537,
    val following: Int = 0,
    val created_at: String = "2011-09-03T15:26:22Z",
    val updated_at: String = "2023-11-12T20:08:30Z"
)








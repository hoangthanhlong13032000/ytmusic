package htlong.learn.youtube.models

import htlong.learn.domain.entities.SuggestQuery

class VSuggestQuery(
    var query: String = "",
    var suggests: ArrayList<String> = arrayListOf(),
    var isHistory: Boolean = false
) {
    constructor(suggestQuery: SuggestQuery, isHistory: Boolean) : this(query = suggestQuery.query, suggests = suggestQuery.suggests, isHistory = isHistory)
}
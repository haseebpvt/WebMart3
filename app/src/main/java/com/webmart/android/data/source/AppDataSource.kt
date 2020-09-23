package com.webmart.android.data.source

import com.android.webmart.data.Result
import com.webmart.android.data.model.Shop

interface AppDataSource {

    suspend fun loadShopsList(): Result<Shop>
}
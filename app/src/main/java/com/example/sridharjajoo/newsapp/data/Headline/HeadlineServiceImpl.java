package com.example.sridharjajoo.newsapp.data.Headline;


import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class HeadlineServiceImpl implements HeadlineService {

    private final HeadlineApi headlineApi;

    @Inject
    public HeadlineServiceImpl(HeadlineApi headlineApi) {
        this.headlineApi = headlineApi;
    }

    @Override
    public Observable<HeadlineResponse> getHeadline(String headlineRequest) {
        return headlineApi.getHeadlines(headlineRequest, "aaefc3faa210424e9978fa75586d9580")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
